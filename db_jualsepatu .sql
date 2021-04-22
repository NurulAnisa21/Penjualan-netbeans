-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 09 Jan 2019 pada 18.22
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_jualsepatu`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailsementara`
--

CREATE TABLE `detailsementara` (
  `no_order` varchar(30) NOT NULL,
  `kd_sepatu` varchar(30) NOT NULL,
  `qty` int(30) NOT NULL,
  `subtotal` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detailsementara`
--

INSERT INTO `detailsementara` (`no_order`, `kd_sepatu`, `qty`, `subtotal`) VALUES
('080119-001', 'KD001', 1, 550000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE `petugas` (
  `kd_petugas` varchar(30) NOT NULL,
  `nm_petugas` varchar(30) NOT NULL,
  `jenkel` varchar(30) NOT NULL,
  `umur_petugas` int(30) NOT NULL,
  `alamat_petugas` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`kd_petugas`, `nm_petugas`, `jenkel`, `umur_petugas`, `alamat_petugas`, `password`) VALUES
('PTG001', 'nurul', 'Perempuan', 20, 'jln jeruk', 'nurul');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sementara`
--

CREATE TABLE `sementara` (
  `kd_sepatu` varchar(30) NOT NULL,
  `nm_sepatu` varchar(30) NOT NULL,
  `harga` int(30) NOT NULL,
  `qty` int(30) NOT NULL,
  `subtotal` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_konfirmasi`
--

CREATE TABLE `tb_konfirmasi` (
  `no_order` varchar(30) NOT NULL,
  `kd_konfirmasi` varchar(30) NOT NULL,
  `kd_user` varchar(30) NOT NULL,
  `nm_user` varchar(30) NOT NULL,
  `jenkel` varchar(30) NOT NULL,
  `nama_bank` varchar(30) NOT NULL,
  `jumlah_tf` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_order`
--

CREATE TABLE `tb_order` (
  `no_order` varchar(30) NOT NULL,
  `tanggal` char(30) NOT NULL,
  `total` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_order`
--

INSERT INTO `tb_order` (`no_order`, `tanggal`, `total`) VALUES
('080119-001', '08-Jan-2019', 550000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_sepatu`
--

CREATE TABLE `t_sepatu` (
  `kd_sepatu` varchar(30) NOT NULL,
  `nm_sepatu` varchar(30) NOT NULL,
  `jenis_sepatu` varchar(30) NOT NULL,
  `ukuran` int(30) NOT NULL,
  `tipe` varchar(30) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_sepatu`
--

INSERT INTO `t_sepatu` (`kd_sepatu`, `nm_sepatu`, `jenis_sepatu`, `ukuran`, `tipe`, `harga`, `stok`) VALUES
('KD001', 'Nike', 'Anak-anak', 39, 'Dewasa', 550000, 2),
('KD002', 'Nike', 'Sport', 36, 'Anak-anak', 240000, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `kd_user` varchar(30) NOT NULL,
  `nm_user` varchar(30) NOT NULL,
  `jenkel` varchar(30) NOT NULL,
  `umur_user` int(5) NOT NULL,
  `alamat_user` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`kd_user`, `nm_user`, `jenkel`, `umur_user`, `alamat_user`, `password`) VALUES
('USR002', 'nabil', 'Laki-laki', 21, 'jln kodam', 'nabil');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`kd_petugas`);

--
-- Indexes for table `t_sepatu`
--
ALTER TABLE `t_sepatu`
  ADD PRIMARY KEY (`kd_sepatu`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`kd_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
