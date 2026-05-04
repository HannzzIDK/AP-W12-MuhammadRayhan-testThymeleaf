package com.testhymeleaf.main.Model;

import jakarta.persistence.Entity;

@Entity
public class Hadir extends Absen {

    public Hadir(Integer id, String nama, String nim, String kelas, String status) {
        super(id, nama, nim, kelas, status);
    }

}
