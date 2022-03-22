package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private MariaDbDataSource dataSource;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try(Connection con = dataSource.getConnection();
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("select breed from dinosaur where actual > expected order by breed")) {
            return getPopulation(rs);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!");
        }
    }

    private List<String> getPopulation(ResultSet rs) throws SQLException {
        List<String> overPopulation = new ArrayList<>();
        while (rs.next()) {
            String breed = rs.getString("breed");
            overPopulation.add(breed);
        }
        return overPopulation;
    }
}
