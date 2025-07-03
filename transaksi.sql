-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2025 at 11:34 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `transaksigadai`
--

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `nama_penggadai` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `nilai_taksir` double NOT NULL,
  `jumlah_pinjaman` float NOT NULL,
  `tanggal_gadai` date NOT NULL,
  `jatuh_tempo` date NOT NULL,
  `status` enum('Digadaikan','Ditebus') NOT NULL,
  `keterangan` text NOT NULL,
  `bunga` double DEFAULT NULL,
  `denda` double DEFAULT NULL,
  `total_tebusan` double DEFAULT NULL,
  `kontak` varchar(20) NOT NULL,
  `tanggal_tebus` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `nama_penggadai`, `nama_barang`, `nilai_taksir`, `jumlah_pinjaman`, `tanggal_gadai`, `jatuh_tempo`, `status`, `keterangan`, `bunga`, `denda`, `total_tebusan`, `kontak`, `tanggal_tebus`) VALUES
(5, 'surya', 'Motor', 15000000, 14000000, '2025-07-03', '2025-08-02', 'Ditebus', 'motor x', 700000, 0, 14700000, '08999789100', '2025-07-03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
