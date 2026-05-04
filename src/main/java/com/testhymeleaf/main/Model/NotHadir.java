package com.testhymeleaf.main.Model;

import jakarta.persistence.Entity;

@Entity
public class NotHadir extends Absen {
    public NotHadir(Integer id, String nama, String nim, String kelas, String status) {
        super(id, nama, nim, kelas, status);
    }
}
