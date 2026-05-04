package com.testhymeleaf.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Absen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id; // primary key dari tabel absen
    private String nama;
    private String nim;
    private String kelas;
    private String status; // status absen

    public Absen() {
    }

    public Absen(Integer id, String nama, String nim, String kelas, String status) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
