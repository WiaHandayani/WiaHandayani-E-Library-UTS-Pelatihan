/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 10.4.14-MariaDB : Database - uts_pelatihan_wia
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`uts_pelatihan_wia` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `uts_pelatihan_wia`;

/*Table structure for table `tb_buku` */

DROP TABLE IF EXISTS `tb_buku`;

CREATE TABLE `tb_buku` (
  `kode_buku` char(5) NOT NULL,
  `judul_buku` varchar(50) NOT NULL,
  `kategori_buku` varchar(30) NOT NULL,
  `penulis` varchar(25) NOT NULL,
  `penerbit` varchar(25) NOT NULL,
  `tahun_terbit` varchar(10) NOT NULL,
  PRIMARY KEY (`kode_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_buku` */

insert  into `tb_buku`(`kode_buku`,`judul_buku`,`kategori_buku`,`penulis`,`penerbit`,`tahun_terbit`) values 
('B0001','Analisis dan Perancangan Sistem','Informatika','Rosa AS dan M Salahudin','Informatika','2015'),
('B0003','Homo Deus:Masa Depan Umat Manusia','Pengetahuan Umum','Yuval Noah Harari','alva bet','2015'),
('B0004','Nebula','Fiksi','Tere Liye','Gramedia Pustaka','2020');

/*Table structure for table `tb_categories` */

DROP TABLE IF EXISTS `tb_categories`;

CREATE TABLE `tb_categories` (
  `kode_kategori` char(5) NOT NULL,
  `nama_kategori` varchar(30) NOT NULL,
  PRIMARY KEY (`kode_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_categories` */

insert  into `tb_categories`(`kode_kategori`,`nama_kategori`) values 
('KT001','Fiksi'),
('KT002','Ilmiah'),
('KT003','Informatika'),
('KT004','Pengetahuan Umum');

/*Table structure for table `tb_member` */

DROP TABLE IF EXISTS `tb_member`;

CREATE TABLE `tb_member` (
  `id_member` char(5) NOT NULL,
  `id_user` char(5) NOT NULL,
  `nama_lengkap` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_anggota` varchar(25) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `pend_terakhir` varchar(10) NOT NULL,
  `pekerjaan` varchar(25) NOT NULL,
  `status_perkawinan` varchar(20) NOT NULL,
  PRIMARY KEY (`id_member`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_member` */

insert  into `tb_member`(`id_member`,`id_user`,`nama_lengkap`,`alamat`,`jenis_anggota`,`jenis_kelamin`,`pend_terakhir`,`pekerjaan`,`status_perkawinan`) values 
('M0001','1','Wia Handayani','Jalan Megaraya 1 No. 31 Sukaraja-Cicendo, Kota Ban','Mahasiswa','Perempuan','S1','Mahasiswa','Belum Menikah'),
('M0002','US001','Della Yulianisha','Gg H. Amsyor Mentor Sukaraja-Cicendo, Kota Bandung','Mahasiswa','Perempuan','D3','Pegawai Swasta','Belum Menikah');

/*Table structure for table `tb_peminjaman` */

DROP TABLE IF EXISTS `tb_peminjaman`;

CREATE TABLE `tb_peminjaman` (
  `id_peminjaman` char(5) NOT NULL,
  `id_member` char(5) NOT NULL,
  `kode_buku` char(5) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `lama_pinjam` int(11) NOT NULL,
  `tgl_kembali` date NOT NULL,
  PRIMARY KEY (`id_peminjaman`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_peminjaman` */

insert  into `tb_peminjaman`(`id_peminjaman`,`id_member`,`kode_buku`,`tgl_pinjam`,`lama_pinjam`,`tgl_kembali`) values 
('PM001','M0002','B0003','2021-05-07',3,'2021-05-11'),
('PM002','M0001','B0004','2021-05-10',2,'2021-05-12');

/*Table structure for table `tb_pengembalian` */

DROP TABLE IF EXISTS `tb_pengembalian`;

CREATE TABLE `tb_pengembalian` (
  `id_pengembalian` char(5) NOT NULL,
  `id_peminjaman` char(5) NOT NULL,
  `tgl_kembali` date NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`id_pengembalian`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_pengembalian` */

insert  into `tb_pengembalian`(`id_pengembalian`,`id_peminjaman`,`tgl_kembali`,`status`) values 
('PG001','PM002','2021-05-12','On-time'),
('PG002','PM001','2021-05-14','On-time');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id_user` char(5) NOT NULL,
  `nama_user` varchar(25) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` int(11) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id_user`,`nama_user`,`username`,`password`,`role`) values 
('1','wia','wia','wia',2),
('2','admin','admin','admin',1),
('US001','della','della','123',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
