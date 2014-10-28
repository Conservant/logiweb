package com.tsystems.projects.logiweb.DAO;

import com.tsystems.projects.logiweb.entities.Driver;
import com.tsystems.projects.logiweb.entities.enums.DriverStatus;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by StarKiller on 19.10.2014.
 */

public class DriverDAO extends AbstractDAO<Driver> {
        public List<Driver> getFreeDrivers() {

            Query q = em.createQuery("select d from Driver d where d.status=:status", Driver.class);
            q.setParameter("status", DriverStatus.FREE);

            List<Driver> drivers = q.getResultList();
//            List<Driver> resList = new ArrayList<Driver>();
//            for(Driver driver: drivers){
//                System.out.println(truck.getOrder());
//                if (truck.getOrder() == null) {
//                    resList.add(truck);
//                }
//            }
            return drivers;
        }
}
