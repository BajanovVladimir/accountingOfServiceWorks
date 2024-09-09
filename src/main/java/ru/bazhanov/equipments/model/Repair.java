package ru.bazhanov.equipments.model;

import java.util.Date;
import java.util.List;

public class Repair {
    private int id;
    private Double repairTime;
    private Date repairDate;
    private List<Element> replacedElementsList;
    private Double price = 0.0;
}
