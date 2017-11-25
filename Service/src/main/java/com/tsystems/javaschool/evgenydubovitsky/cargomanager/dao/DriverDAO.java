package com.tsystems.javaschool.evgenydubovitsky.cargomanager.dao;

import com.tsystems.javaschool.evgenydubovitsky.cargomanager.entity.City;
import com.tsystems.javaschool.evgenydubovitsky.cargomanager.entity.Driver;
import com.tsystems.javaschool.evgenydubovitsky.cargomanager.entity.Vehicle;

public interface DriverDAO extends DAO<Driver> {

    Driver selectByPersNumber(String persNumber);

    void move(Driver driver, City location);

    void bind(Driver driver, Vehicle vehicle);

    void unbind(Driver driver);

    void updateStatus(Driver driver, Driver.Status status);
}
