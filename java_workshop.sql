-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2024 at 03:58 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tt`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `brand_id` varchar(4) NOT NULL,
  `brand_name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES
('B001', 'ເບຍລາວ'),
('B002', 'ແປັບຊີ'),
('B003', 'ໄຮນາເກັນ'),
('B004', 'ຄາວສເບີກ'),
('B005', 'ໂອອີຊິ'),
('B006', 'ສຕິງ');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` varchar(4) NOT NULL,
  `category_name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_name`) VALUES
('C001', 'ເບຍ'),
('C002', 'ນໍ້າອັດລົມ'),
('C003', 'ວາຍ'),
('C004', 'ນໍ້າໝາກໄມ້'),
('C005', 'ເຂົ້າໝົມ'),
('C006', 'ນໍ້າຊາ'),
('C007', 'ເຄື່ອງດື່ມຊູກໍາລັງ');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cus_id` varchar(10) NOT NULL,
  `cus_name` varchar(25) NOT NULL,
  `cus_lname` varchar(25) NOT NULL,
  `gender` varchar(25) NOT NULL,
  `address` varchar(25) NOT NULL,
  `tel` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cus_id`, `cus_name`, `cus_lname`, `gender`, `address`, `tel`) VALUES
('CUS0000001', 'ບໍ່ລະບຸ', 'ບໍ່ລະບຸ', 'ຍິງ', 'ນະຄອນຫຼວງວຽງຈັນ', '020 55668944'),
('CUS0000002', 'ນິພົນ', 'ບຸນຍາວົງ', 'ຊາຍ', 'ວຽງຈັນ', '020 25229267'),
('CUS0000003', 'ດາວພະສຸກ', 'ສີທາ', 'ຍິງ', 'ປາກຊັນ', '202 29393734'),
('CUS0000004', 'ສາດສະຫວັນ', 'ບຸນທະຮັກ', 'ຊາຍ', 'ປາກເຊ', '020 72115588'),
('CUS0000005', 'ຊ້າງ', 'ພົມພິທັກ', 'ຊາຍ', 'ປາກເຊ', '020 92868358'),
('CUS0000006', 'ຈອນສັນ', 'ພັນດາວົງ', 'ຍິງ', 'ວຽງຈັນ', '020 54411188'),
('CUS0000007', 'ພອນເທວາ', 'ໄຊຍະວົງ', 'ຍິງ', 'ນະຄອນຫຼວງວຽງຈັນ', '020 78889999'),
('CUS0000008', 'ວົງມະນີ', 'ລາບບັນດິດ', 'ຍິງ', 'ໂສກປ່າຫຼວງ', '020 96887222');

-- --------------------------------------------------------

--
-- Table structure for table `district`
--

CREATE TABLE `district` (
  `district_id` int(3) NOT NULL,
  `district_name` varchar(25) NOT NULL,
  `province_id` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `district`
--

INSERT INTO `district` (`district_id`, `district_name`, `province_id`) VALUES
(1, ' ຈັນທະບູລີ', 1),
(2, ' ໄຊເສດຖາ', 1),
(3, ' ສີໂຄດຕະບອງ', 1),
(4, ' ສີສັດຕະນາກ', 1),
(5, ' ຫາດຊາຍຟອງ', 1),
(6, ' ນາຊາຍທອງ', 1),
(7, ' ໄຊທານີ', 1),
(8, ' ສັງທອງ', 1),
(9, ' ປາກງື່ມ', 1),
(10, ' ບຸນໃຕ້', 2),
(11, ' ຂວາ', 2),
(12, ' ໃໝ່', 2),
(13, ' ຍອດອູ', 2),
(14, ' ຜົ້ງສາລີ', 2),
(15, ' ສໍາພັນ', 2),
(16, ' ບຸນເໜືອ', 2),
(17, ' ຫຼວງນໍ້າທາ', 3),
(18, ' ສີງ', 3),
(19, ' ລອງ', 3),
(20, ' ວຽງພູຄາ', 3),
(21, ' ນາແລ', 3),
(22, ' ຫ້ວຍຊາຍ', 4),
(23, ' ຕົ້ນເຜິ້ງ', 4),
(24, ' ເມິງ', 4),
(25, ' ຜາອຸດົມ', 4),
(26, ' ປາກທາ', 4),
(27, ' ໄຊ', 5),
(28, ' ຫລາ', 5),
(29, ' ນາໝໍ້', 5),
(30, ' ງາ', 5),
(31, ' ແບ່ງ', 5),
(32, ' ຮຸນ', 5),
(33, ' ປາກແບ່ງ', 5),
(34, ' ຫຼວງພະບາງ', 6),
(35, ' ຊຽງເງິນ', 6),
(36, ' ນານ', 6),
(37, ' ປາກອູ', 6),
(38, ' ນໍ້າບາກ', 6),
(39, ' ງອຍ', 6),
(40, ' ປາກແຊງ', 6),
(41, ' ໂພນໄຊ', 6),
(42, ' ຈອມເພັດ', 6),
(43, ' ວຽງຄໍາ', 6),
(44, ' ພູຄູນ', 6),
(45, ' ໂພນທອງ', 6),
(46, ' ບໍ່ແຕນ', 7),
(47, ' ຫົງສາ', 7),
(48, ' ແກ່ນທ້າວ', 7),
(49, ' ຄອບ', 7),
(50, ' ເງິນ', 7),
(51, ' ປາກລາຍ', 7),
(52, ' ພຽງ', 7),
(53, ' ທົ່ງມີໄຊ', 7),
(54, ' ໄຊຍະບູລີ', 7),
(55, ' ຊຽງຮ່ອນ', 7),
(56, ' ໄຊສະຖານ', 7),
(57, ' ຊໍາເໜືອ', 8),
(58, ' ຊຽງຄໍ້', 8),
(59, ' ຮ້ຽມ', 8),
(60, ' ວຽງໄຊ', 8),
(61, ' ຫົວ', 8),
(62, ' ຊໍາໃຕ້', 8),
(63, ' ສົບເບົາ', 8),
(64, ' ແອດ', 8),
(65, ' ກວັນ', 8),
(66, ' ຊ່ອນ', 8),
(67, ' ແປກ', 9),
(68, 'ຄໍາ', 9),
(69, ' ໜອງແຮດ', 9),
(70, ' ຄູນ', 9),
(71, ' ໝອກ', 9),
(72, ' ພູກູດ', 9),
(73, ' ຜາໄຊ', 9),
(74, ' ເຟືອງ', 10),
(75, ' ຫີນເຫີບ', 10),
(76, ' ກາສີ', 10),
(77, ' ແກ້ວອຸດົມ', 10),
(78, ' ແມດ', 10),
(79, ' ໂພນໂຮງ', 10),
(80, ' ທຸລະຄົມ', 10),
(81, ' ວັງວຽງ', 10),
(82, ' ວຽງຄໍາ', 10),
(83, ' ຊະນະຄາມ', 10),
(84, ' ໝື່ນ', 10),
(85, ' ລ້ອງແຈ້ງ', 11),
(86, ' ທ່າໂທມ', 11),
(87, ' ອະນຸວົງ', 11),
(88, ' ລ້ອງຊານ', 11),
(89, ' ຮົ່ມ', 11),
(90, ' ປາກຊັນ', 12),
(91, ' ທ່າພະບາດ', 12),
(92, ' ປາກກະດິງ', 12),
(93, ' ຄໍາເກີດ', 12),
(94, ' ບໍລິຄັນ', 12),
(95, ' ວຽງທອງ', 12),
(96, ' ໄຊຈໍາພອນ', 12),
(97, ' ທ່າແຂກ', 13),
(98, ' ມະຫາໄຊ', 13),
(99, ' ໜອງບົກ', 13),
(100, ' ຫີນບູນ', 13),
(101, ' ຍົມມະລາດ', 13),
(102, ' ບົວລະພາ', 13),
(103, ' ນາກາຍ', 13),
(104, ' ເຊບັ້ງໄຟ', 13),
(105, ' ໄຊບົວທອງ', 13),
(106, ' ຄູນຄໍາ', 13),
(107, ' ໄກສອນ ພົມວິຫານ', 14),
(108, ' ອຸທຸມພອນ', 14),
(109, ' ອາດສະພັງທອງ', 14),
(110, ' ພີນ', 14),
(111, ' ເຊໂປນ', 14),
(112, ' ນອງ', 14),
(113, ' ທ່າປາງທອງ', 14),
(114, ' ສອງຄອນ', 14),
(115, ' ຈໍາພອນ', 14),
(116, ' ຊົນນະບູລີ', 14),
(117, ' ໄຊບູລີ', 14),
(118, ' ວິລະບູລີ', 14),
(119, ' ອາດສະພອນ', 14),
(120, ' ໄຊພູທອງ', 14),
(121, ' ພະລານໄຊ', 14),
(122, ' ສາລະວັນ', 15),
(123, ' ລະຄອນເພັງ', 15),
(124, ' ວາປີ', 15),
(125, ' ເລົ່າງາມ', 15),
(126, ' ຕຸ້ມລານ', 15),
(127, ' ຕະໂອ້ຍ', 15),
(128, ' ຄົງເຊໂດນ', 15),
(129, ' ສະມ້ວຍ', 15),
(130, ' ປາກເຊ', 16),
(131, ' ຊະນະສົມບູນ', 16),
(132, ' ບາຈຽງຈະເລີນສຸກ', 16),
(133, ' ປາກຊ່ອງ', 16),
(134, ' ປະທຸມພອນ', 16),
(135, ' ໂພນທອງ', 16),
(136, ' ຈໍາປາສັກ', 16),
(137, ' ສຸຂຸມາ', 16),
(138, ' ມູນລະປະໂມກ', 16),
(139, ' ໂຂງ', 16),
(140, ' ທ່າແຕງ', 17),
(141, ' ລະມາມ', 17),
(142, ' ກະລຶມ', 17),
(143, ' ດັກຈຶງ', 17),
(144, ' ໄຊເຊດຖາ', 18),
(145, ' ສາມັກຄີໄຊ', 18),
(146, ' ສະໜາມໄຊ', 18),
(147, ' ຊານໄຊ', 18),
(148, ' ພູວົງ', 18);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_id` varchar(8) NOT NULL,
  `emp_name` varchar(25) NOT NULL,
  `emp_lname` varchar(25) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_b` date NOT NULL,
  `village` varchar(25) NOT NULL,
  `city` varchar(25) NOT NULL,
  `province` varchar(25) NOT NULL,
  `tel` varchar(15) NOT NULL,
  `start_date` date NOT NULL,
  `picture` longblob DEFAULT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(32) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `exchange_rate`
--

CREATE TABLE `exchange_rate` (
  `id` int(11) NOT NULL,
  `dolar` decimal(7,2) NOT NULL,
  `bath` decimal(6,2) NOT NULL,
  `ex_date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `import`
--

CREATE TABLE `import` (
  `imp_id` int(11) NOT NULL,
  `emp_id` varchar(8) NOT NULL,
  `order_id` int(11) NOT NULL,
  `imp_date` date NOT NULL DEFAULT current_timestamp(),
  `total_price` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `import_detail`
--

CREATE TABLE `import_detail` (
  `emp_d_id` int(11) NOT NULL,
  `imp_id` int(11) NOT NULL,
  `product_id` varchar(13) NOT NULL,
  `quantity` int(4) NOT NULL,
  `cost_price` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `supplier_id` varchar(6) NOT NULL,
  `emp_id` varchar(8) NOT NULL,
  `order_date` date NOT NULL DEFAULT current_timestamp(),
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `order_detial`
--

CREATE TABLE `order_detial` (
  `order_de_id` int(11) NOT NULL,
  `product_id` varchar(13) NOT NULL,
  `order_id` int(11) NOT NULL,
  `quantity` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `barcode` varchar(13) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `unit` varchar(25) NOT NULL,
  `quantity` int(4) NOT NULL,
  `quantity_min` int(4) NOT NULL,
  `cost_price` decimal(10,0) NOT NULL,
  `retail_price` decimal(10,0) NOT NULL,
  `brand_id` varchar(4) NOT NULL,
  `category_id` varchar(4) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `province`
--

CREATE TABLE `province` (
  `province_id` int(2) NOT NULL,
  `province_name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `province`
--

INSERT INTO `province` (`province_id`, `province_name`) VALUES
(1, 'ນະຄອນຫຼວງວຽງຈັນ'),
(2, 'ຜົ້ງສາລີ'),
(3, 'ຫຼວງນ້ຳທາ'),
(4, 'ບໍ່ແກ້ວ'),
(5, 'ອຸດົມໄຊ'),
(6, 'ຫລວງພະບາງ'),
(7, 'ໄຊຍະບູລີ'),
(8, 'ຫົວພັນ'),
(9, 'ຊຽງຂວາງ'),
(10, 'ວຽງຈັນ'),
(11, 'ໄຊສົມບູນ'),
(12, 'ບໍລິຄຳໄຊ'),
(13, 'ຄຳມ່ວນ'),
(14, 'ສະຫວັນນະເຂດ'),
(15, 'ສາລະວັນ'),
(16, 'ຈຳປາສັກ'),
(17, 'ເຊກອງ'),
(18, 'ອັດຕະປື');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `sale_id` int(11) NOT NULL,
  `ex_id` int(11) NOT NULL,
  `cus_id` varchar(10) NOT NULL,
  `emp_id` varchar(8) NOT NULL,
  `date_sale` datetime NOT NULL DEFAULT current_timestamp(),
  `subtotal` decimal(12,2) NOT NULL,
  `pay` decimal(12,2) NOT NULL,
  `money_change` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sales_product`
--

CREATE TABLE `sales_product` (
  `id` int(11) NOT NULL,
  `sales_id` int(11) NOT NULL,
  `product_id` varchar(13) NOT NULL,
  `qty` int(4) NOT NULL,
  `price` decimal(12,2) NOT NULL,
  `total` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `sup_id` varchar(6) NOT NULL,
  `sup_name` varchar(100) NOT NULL,
  `contract_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`sup_id`, `sup_name`, `contract_name`, `email`, `telephone`, `address`) VALUES
('SUP001', 'ບໍລິສັດ ເຄທີ ການຄ້າ ຈໍາກັດ', 'ນາງ ສຸດາພອນ ຈັນທະລັງສີ', 'soudaphone@gmail.com', '020 2233 4422', 'ຮ່ວມ 12 ບ້ານ ສີໄຄທົ່ງ ເມືອງ ສີໂຄດຕະບອງ ນະຄອນຫຼວງ'),
('SUP002', 'ບໍລິສັດ ສຸລິວັນ ການຄ້າ ນຳເຂົ້າ-ສົ່ງອອກ ຈຳກັດຜູ້ດຽວ', 'ນາງ ໄອລິນ ສີບຸນເຮືອງ', 'ailin_sb2023@gmail.coml', '02054460544', 'ບ້ານ ທົງສັງນາງ, ເມືອງຈັນທະບູລີ, ນະຄອນຫຼວງວຽງຈັນ'),
('SUP003', 'ບໍລິສັດການຄ້າ (Trading Company)', 'ນາງ ອາລິຕ້າ', 'info@nmslao.com', '021 316704', 'ສະຖານທີ່ບໍລິສັດຕັ້ງຢູ່ ບ້ານ ໂພນສະຫວັນໄຕ້, ຮ່ອມ 4 ເມືອງ ສີສັດຕະນາກ, ນະຄອນຫຼວງວຽງຈັນ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`brand_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cus_id`);

--
-- Indexes for table `district`
--
ALTER TABLE `district`
  ADD PRIMARY KEY (`district_id`),
  ADD KEY `province_id` (`province_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `exchange_rate`
--
ALTER TABLE `exchange_rate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `import`
--
ALTER TABLE `import`
  ADD PRIMARY KEY (`imp_id`),
  ADD KEY `emp_id` (`emp_id`),
  ADD KEY `order_id` (`order_id`);

--
-- Indexes for table `import_detail`
--
ALTER TABLE `import_detail`
  ADD PRIMARY KEY (`emp_d_id`),
  ADD KEY `imp_id` (`imp_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `emp_id` (`emp_id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Indexes for table `order_detial`
--
ALTER TABLE `order_detial`
  ADD PRIMARY KEY (`order_de_id`),
  ADD KEY `order_id` (`order_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`barcode`),
  ADD KEY `brand_id` (`brand_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `province`
--
ALTER TABLE `province`
  ADD PRIMARY KEY (`province_id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`sale_id`),
  ADD KEY `cus_id` (`cus_id`),
  ADD KEY `emp_id` (`emp_id`),
  ADD KEY `ex_id` (`ex_id`);

--
-- Indexes for table `sales_product`
--
ALTER TABLE `sales_product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sales_id` (`sales_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`sup_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exchange_rate`
--
ALTER TABLE `exchange_rate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `import`
--
ALTER TABLE `import`
  MODIFY `imp_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `import_detail`
--
ALTER TABLE `import_detail`
  MODIFY `emp_d_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `order_detial`
--
ALTER TABLE `order_detial`
  MODIFY `order_de_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `sale_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=91;

--
-- AUTO_INCREMENT for table `sales_product`
--
ALTER TABLE `sales_product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=180;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
