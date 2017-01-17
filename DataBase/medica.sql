-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2013 at 10:17 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `medica`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE IF NOT EXISTS `dokter` (
  `kd_dokter` varchar(8) NOT NULL,
  `nm_dokter` varchar(40) NOT NULL,
  `jk` enum('L','P') NOT NULL,
  `tmp_lahir` varchar(15) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `gol_drh` enum('A','B','AB','O') NOT NULL,
  `agama` enum('Islam','Kristen','Hindu','Budha') NOT NULL,
  `almt_tgl` varchar(60) NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `stts_nikah` enum('Menikah','Singgle') NOT NULL,
  `alumni` varchar(60) NOT NULL,
  `no_ijin_prak` varchar(20) NOT NULL,
  PRIMARY KEY (`kd_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `nm_dokter`, `jk`, `tmp_lahir`, `tgl_lahir`, `gol_drh`, `agama`, `almt_tgl`, `no_telp`, `stts_nikah`, `alumni`, `no_ijin_prak`) VALUES
('12', 'asc', '', '', '1980-01-01', '', '', '-', 'Item 1', '', '', ''),
('12110968', 'arie wah', 'L', 'karanganyar', '1993-02-16', 'O', 'Islam', 'sleman', '089609255041', 'Singgle', 'man kra', '1234567890'),
('123', 'fds', 'L', 'ads', '1980-01-01', 'A', 'Islam', 'vdsva', '', 'Menikah', '', ''),
('155', 'arie', 'L', 'karanganyar', '1993-02-16', 'O', 'Islam', 'ledok', '088124', 'Singgle', 'giefac', '73698');

-- --------------------------------------------------------

--
-- Table structure for table `imunisasi`
--

CREATE TABLE IF NOT EXISTS `imunisasi` (
  `kd_imunisasi` varchar(5) NOT NULL,
  `nm_imunisasi` varchar(50) NOT NULL,
  PRIMARY KEY (`kd_imunisasi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE IF NOT EXISTS `kamar` (
  `kd_kamar` char(5) NOT NULL,
  `kelas` text NOT NULL,
  `nm_kamar` varchar(50) NOT NULL,
  PRIMARY KEY (`kd_kamar`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien_bayi`
--

CREATE TABLE IF NOT EXISTS `pasien_bayi` (
  `no_rm_bayi` varchar(10) NOT NULL,
  `no_rm_ibu` varchar(10) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jam` time NOT NULL,
  `umur` varchar(6) NOT NULL,
  `proses_lahir` varchar(15) NOT NULL,
  `jk` enum('L','P') NOT NULL,
  `berat_badan` varchar(12) NOT NULL,
  `panjang_badan` varchar(10) NOT NULL,
  `lingkar_kepala` varchar(8) NOT NULL,
  `tgl_daftar` date NOT NULL,
  `ket` varchar(60) NOT NULL,
  `anakke` char(2) NOT NULL,
  PRIMARY KEY (`no_rm_bayi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien_ibu`
--

CREATE TABLE IF NOT EXISTS `pasien_ibu` (
  `no_rm_ibu` varchar(10) NOT NULL,
  `nm_pasien` varchar(40) NOT NULL,
  `suami` varchar(40) NOT NULL,
  `umur` char(2) NOT NULL,
  `alergi_obat` varchar(40) NOT NULL,
  `stts_ingin` enum('Ingin Anak','Tidak') NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `gol_drh` enum('A','B','AB','O') NOT NULL,
  `pekerjaan` varchar(15) NOT NULL,
  `agama` enum('Islam','Kristen','Khatolik','hindu','budah','lainya') NOT NULL,
  `tgl_daftar` date NOT NULL,
  `diagnosa_awal` varchar(100) NOT NULL,
  `pddkn` enum('Tk','SD','SMP','SMA','SMK','D1','D2','D3','D4','S1','S2','S3') NOT NULL,
  `stts_nikah` enum('Singgle','Menikan','Janda') NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  PRIMARY KEY (`no_rm_ibu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien_mati_bayi`
--

CREATE TABLE IF NOT EXISTS `pasien_mati_bayi` (
  `no_rm_bayi` varchar(10) NOT NULL,
  `tgl` date NOT NULL,
  `jam` time NOT NULL,
  `ket` varchar(100) NOT NULL,
  PRIMARY KEY (`no_rm_bayi`),
  KEY `no_rm_bayi` (`no_rm_bayi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien_mati_ibu`
--

CREATE TABLE IF NOT EXISTS `pasien_mati_ibu` (
  `no_rm_ibu` varchar(10) NOT NULL,
  `jam` time NOT NULL,
  `tgl` date NOT NULL,
  `ket` varchar(100) NOT NULL,
  PRIMARY KEY (`no_rm_ibu`),
  KEY `no_rm_ibu` (`no_rm_ibu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE IF NOT EXISTS `penyakit` (
  `kd_icd` varchar(20) NOT NULL,
  `nm_penyakit` varchar(100) NOT NULL,
  `jenis` enum('Ranap Ibu','Ralan Ibu','Ranap Bayi','Ralan Bayi','Ranap Umum','Ralan Umum') NOT NULL,
  PRIMARY KEY (`kd_icd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rawat_inab_bayi`
--

CREATE TABLE IF NOT EXISTS `rawat_inab_bayi` (
  `no` int(11) NOT NULL,
  `no_rm_bayi` varchar(15) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_pulang` date NOT NULL,
  `lama` varchar(15) NOT NULL,
  `kd_kamar` varchar(5) NOT NULL,
  `kd_dokter` varchar(8) NOT NULL,
  `kd_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `resusitas` varchar(20) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `ket` varchar(50) NOT NULL,
  `apger` varchar(5) NOT NULL,
  PRIMARY KEY (`no`),
  KEY `no_rm_bayi` (`no_rm_bayi`),
  KEY `kd_kamar` (`kd_kamar`),
  KEY `kd_dokter` (`kd_dokter`),
  KEY `kd_tindakan` (`kd_tindakan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rawat_inab_ibu`
--

CREATE TABLE IF NOT EXISTS `rawat_inab_ibu` (
  `no` int(11) NOT NULL,
  `no_rm_ibu` varchar(15) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_pulang` date NOT NULL,
  `lama` varchar(15) NOT NULL,
  `kd_kamar` varchar(5) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kd_dokter` varchar(15) NOT NULL,
  `kd_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `tensi` varchar(10) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `ket` varchar(50) NOT NULL,
  PRIMARY KEY (`no`),
  KEY `no_rm_ibu` (`no_rm_ibu`),
  KEY `kd_kamar` (`kd_kamar`),
  KEY `kd_icd` (`kd_icd`),
  KEY `kd_tindakan` (`kd_tindakan`),
  KEY `kd_dokter` (`kd_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rawat_jl_bayi`
--

CREATE TABLE IF NOT EXISTS `rawat_jl_bayi` (
  `no` int(11) NOT NULL,
  `tgl` text NOT NULL,
  `no_rm_bayi` varchar(10) NOT NULL,
  `kd_dokter` varchar(8) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kd_tindakan` varchar(5) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `tensi` varchar(3) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `ket` varchar(50) NOT NULL,
  `kd_imunisasi` varchar(5) NOT NULL,
  `imunke` char(2) NOT NULL,
  PRIMARY KEY (`no`),
  KEY `no_rm_bayi` (`no_rm_bayi`),
  KEY `kd_dokter` (`kd_dokter`),
  KEY `kd_icd` (`kd_icd`),
  KEY `kd_tindakan` (`kd_tindakan`),
  KEY `kd_imunisasi` (`kd_imunisasi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rawat_jl_ibu`
--

CREATE TABLE IF NOT EXISTS `rawat_jl_ibu` (
  `no` int(11) NOT NULL,
  `tgl` date NOT NULL,
  `no_rm_ibu` varchar(15) NOT NULL,
  `kd_dokter` varchar(15) NOT NULL,
  `kd_icd` varchar(20) NOT NULL,
  `kd_tindakan` varchar(15) NOT NULL,
  `suhu_tubuh` char(2) NOT NULL,
  `tensi` varchar(10) NOT NULL,
  `hasil` varchar(300) NOT NULL,
  `ket` varchar(50) NOT NULL,
  `biaya` double NOT NULL,
  PRIMARY KEY (`no`),
  KEY `no_rm_ibu` (`no_rm_ibu`),
  KEY `kd_dokter` (`kd_dokter`),
  KEY `kd_icd` (`kd_icd`),
  KEY `kd_tindakan` (`kd_tindakan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tindakan`
--

CREATE TABLE IF NOT EXISTS `tindakan` (
  `kd` varchar(5) NOT NULL,
  `nm_tindakan` varchar(100) NOT NULL,
  `diagnosa` varchar(200) NOT NULL,
  `jenis` enum('Ranap Ibu','Ralan Ibu','Ranap Bayi','Ralan Bayi','Ranap Umum','Ralan Umum') NOT NULL,
  PRIMARY KEY (`kd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pasien_mati_bayi`
--
ALTER TABLE `pasien_mati_bayi`
  ADD CONSTRAINT `pasien_mati_bayi_ibfk_1` FOREIGN KEY (`no_rm_bayi`) REFERENCES `pasien_bayi` (`no_rm_bayi`);

--
-- Constraints for table `pasien_mati_ibu`
--
ALTER TABLE `pasien_mati_ibu`
  ADD CONSTRAINT `pasien_mati_ibu_ibfk_1` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rawat_inab_bayi`
--
ALTER TABLE `rawat_inab_bayi`
  ADD CONSTRAINT `rawat_inab_bayi_ibfk_1` FOREIGN KEY (`no_rm_bayi`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_bayi_ibfk_2` FOREIGN KEY (`kd_kamar`) REFERENCES `kamar` (`kd_kamar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_bayi_ibfk_3` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_bayi_ibfk_4` FOREIGN KEY (`kd_tindakan`) REFERENCES `tindakan` (`kd`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rawat_inab_ibu`
--
ALTER TABLE `rawat_inab_ibu`
  ADD CONSTRAINT `rawat_inab_ibu_ibfk_1` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_ibu_ibfk_2` FOREIGN KEY (`kd_kamar`) REFERENCES `kamar` (`kd_kamar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_ibu_ibfk_3` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_ibu_ibfk_4` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_inab_ibu_ibfk_5` FOREIGN KEY (`kd_tindakan`) REFERENCES `tindakan` (`kd`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rawat_jl_bayi`
--
ALTER TABLE `rawat_jl_bayi`
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_1` FOREIGN KEY (`no_rm_bayi`) REFERENCES `pasien_bayi` (`no_rm_bayi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_2` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_3` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_4` FOREIGN KEY (`kd_tindakan`) REFERENCES `tindakan` (`kd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_bayi_ibfk_5` FOREIGN KEY (`kd_imunisasi`) REFERENCES `imunisasi` (`kd_imunisasi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rawat_jl_ibu`
--
ALTER TABLE `rawat_jl_ibu`
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_1` FOREIGN KEY (`no_rm_ibu`) REFERENCES `pasien_ibu` (`no_rm_ibu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_2` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_3` FOREIGN KEY (`kd_icd`) REFERENCES `penyakit` (`kd_icd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rawat_jl_ibu_ibfk_4` FOREIGN KEY (`kd_tindakan`) REFERENCES `tindakan` (`kd`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
