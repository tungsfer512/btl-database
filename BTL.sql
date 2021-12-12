-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.27 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for quanlisuckhoe
CREATE DATABASE IF NOT EXISTS `quanlisuckhoe` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quanlisuckhoe`;

-- Dumping structure for table quanlisuckhoe.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `IDAdmin` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoTen` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDienThoai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.admin: ~1 rows (approximately)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`IDAdmin`, `HoTen`, `SoDienThoai`, `Email`) VALUES
	('admin', 'admin', '0329689087', 'nhuan@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.capnhatloikhuyen
CREATE TABLE IF NOT EXISTS `capnhatloikhuyen` (
  `IDAdmin` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TheTrang` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayCapNhat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`,`TheTrang`,`NgayCapNhat`) USING BTREE,
  KEY `FK_capnhatloikhuyen_loikhuyen` (`TheTrang`),
  CONSTRAINT `FK_capnhatloikhuyen_admin` FOREIGN KEY (`IDAdmin`) REFERENCES `admin` (`IDAdmin`),
  CONSTRAINT `FK_capnhatloikhuyen_loikhuyen` FOREIGN KEY (`TheTrang`) REFERENCES `loikhuyen` (`TheTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.capnhatloikhuyen: ~4 rows (approximately)
/*!40000 ALTER TABLE `capnhatloikhuyen` DISABLE KEYS */;
INSERT INTO `capnhatloikhuyen` (`IDAdmin`, `TheTrang`, `NgayCapNhat`) VALUES
	('admin', 'Béo phì độ I', '25-11-2021 21:44:19'),
	('admin', 'Béo phì độ II', '25-11-2021 20:49:34'),
	('admin', 'Béo phì độ II', '25-11-2021 21:42:03'),
	('admin', 'Gầy độ 1', '08-12-2021 23:29:42');
/*!40000 ALTER TABLE `capnhatloikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.capnhattrungtam
CREATE TABLE IF NOT EXISTS `capnhattrungtam` (
  `IDAdmin` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `IDTrungTam` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayCapNhat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`,`IDTrungTam`,`NgayCapNhat`) USING BTREE,
  KEY `FK_capnhattrungtam_trungtam` (`IDTrungTam`),
  CONSTRAINT `FK_capnhattrungtam_admin` FOREIGN KEY (`IDAdmin`) REFERENCES `admin` (`IDAdmin`),
  CONSTRAINT `FK_capnhattrungtam_trungtam` FOREIGN KEY (`IDTrungTam`) REFERENCES `trungtam` (`IDTrungTam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.capnhattrungtam: ~3 rows (approximately)
/*!40000 ALTER TABLE `capnhattrungtam` DISABLE KEYS */;
INSERT INTO `capnhattrungtam` (`IDAdmin`, `IDTrungTam`, `NgayCapNhat`) VALUES
	('admin', '123456789', '08-12-2021 23:30:44'),
	('admin', 'A000001', '25-11-2021 21:43:14'),
	('admin', 'DP0001', '25-11-2021 20:50:33');
/*!40000 ALTER TABLE `capnhattrungtam` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.loikhuyen
CREATE TABLE IF NOT EXISTS `loikhuyen` (
  `TheTrang` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TapLuyen` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DinhDuong` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`TheTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.loikhuyen: ~8 rows (approximately)
/*!40000 ALTER TABLE `loikhuyen` DISABLE KEYS */;
INSERT INTO `loikhuyen` (`TheTrang`, `TapLuyen`, `DinhDuong`) VALUES
	('Béo phì độ I', 'kjshdgs adkajsdh asdkjas djas', 'jkdhsajk djksah dsajk dá d'),
	('Béo phì độ II', 'sfkjds fjkdshfds fkjh', 'djflhdjskf skdjf dsjkf '),
	('Béo phì độ III', 'Bạn đang ở một tình trạng sức khỏe rất tệ, khả năng tập luyện của bạn là rất kém. Nên để có thể giảm cân hiệu quả, bạn hãy tham khảo các trung tâm gần nơi bạn ở mà app cung cấp. Như vậy bạn sẽ có thể có một chế độ tập luyện khoa học.', 'Chế độ dinh dưỡng chiếm 70% trong quá trình giảm cân. Nên khi bạn đến các trung tâm sẽ được hướng dẫn chế độ ăn hợp lí. Từ đó, giúp bạn giảm cân nhanh chóng và hiệu quả.'),
	('Bình thường', 'Nếu bạn đang ở thể trạng như vậy thì bạn đang có một thể trạng khá tốt. Tuy nhiên bạn nên luyện tập hàng ngày để có thể duy trì được thể trạng tốt như thế này.', 'Bạn có thể áp dụng dinh dưỡng điều độ bình thường với gia đình. Hạn chế rượu bia, thuốc là, các chất gây hại.'),
	('Gầy độ 1', 'Tap luyen', 'An Nhieu Hon'),
	('Gầy độ 2', 'Với thể trạng này, cơ thể rất yếu, chưa thể tập luyện mạnh như người bình thường. Hãy bắt đầu bằng việc đi bộ, hay tập nhẹ để làm quen dần với các bài tập. Nên tìm đến các trung tâm để kèm 1:1.', 'Bạn nên ăn nhiều, chia nhỏ các bữa ăn trong ngày, để cơ thể lên tục được nạp năng lượng. Từ đó sẽ giúp bạn tăng được chế độ ăn'),
	('Gầy độ 3', 'Tình trạng này thì cơ thể đang rất yếu, nên sẽ bắt đầu tập luyện bằng các bài tập nhẹ khởi động để cơ thể có thể làm quen dần với cường độ tập. Có thể chỉ cần tập 30 phút mỗi ngày để cơ bắt được tác động và phát triển. Bạn nên đến một huấn luyện viên chuyên nghiệp để có thể được tư vấn tốt hơn.', 'Với người gầy như thế này bạn nên chia nhỏ các bữa anh mỗi ngày ra(tầm 5-6 bữa/trên ngày). Như vậy bạn có thể bổ xung năng lượng liên tục trong ngày.'),
	('Thừa cân', 'Bạn đang ở mức độ không quá xấu, vậy nên bạn cần nhanh chóng luyện tập mỗi ngày. Để cơ thể khỏe và trở về trạng thái bình thường.', 'Hạn chế ăn đồ dầu mỡ, giảm đi bớt các đồ ăn nhiều calo. ');
/*!40000 ALTER TABLE `loikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.nhapthongtinvaloikhuyen
CREATE TABLE IF NOT EXISTS `nhapthongtinvaloikhuyen` (
  `UserID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Day` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `ChieuCao` double NOT NULL DEFAULT '0',
  `CanNang` double NOT NULL DEFAULT '0',
  `BMI` double NOT NULL DEFAULT '0',
  `TheTrang` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`,`Day`),
  KEY `FK_nhapthongtinvaloikhuyen_loikhuyen` (`TheTrang`),
  CONSTRAINT `FK_nhapthongtinvaloikhuyen_loikhuyen` FOREIGN KEY (`TheTrang`) REFERENCES `loikhuyen` (`TheTrang`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_nhapthongtinvaloikhuyen_user` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.nhapthongtinvaloikhuyen: ~13 rows (approximately)
/*!40000 ALTER TABLE `nhapthongtinvaloikhuyen` DISABLE KEYS */;
INSERT INTO `nhapthongtinvaloikhuyen` (`UserID`, `Day`, `ChieuCao`, `CanNang`, `BMI`, `TheTrang`) VALUES
	('abcd', '02-12-2021 00:36:35', 567, 789, 24.542052760747648, 'Bình thường'),
	('nhuan1234', '24-11-2021 21:40:28', 254, 121, 18.75503751007502, 'Bình thường'),
	('nhuan12345', '01-12-2021 22:46:33', 435, 435345, 23006.738010305195, 'Béo phì độ III'),
	('nhuan12345', '02-11-2021 20:35:34', 123, 267, 0.2303370786516854, 'Gầy độ 3'),
	('nhuan12345', '02-11-2021 22:02:26', 78, 160, 30.46875, 'Béo phì độ I'),
	('nhuan12345', '02-12-2021 00:28:39', 345, 123, 10.33396345305608, 'Gầy độ 3'),
	('nhuan123456', '04-11-2021 19:36:23', 75, 159, 29.666548000474666, 'Thừa cân'),
	('nhuan1234567', '09-12-2021 15:23:18', 234, 123, 22.463291694060924, 'Bình thường'),
	('nhuan1234567', '09-12-2021 15:23:39', 160, 79, 30.859375, 'Béo phì độ I'),
	('nhuan512', '08-12-2021 23:33:37', 160, 89, 34.765625, 'Béo phì độ I'),
	('nhuan512', '08-12-2021 23:37:35', 234, 234, 42.73504273504273, 'Béo phì độ III'),
	('tung5', '01-12-2021 22:42:43', 680, 678, 14.662629757785467, 'Gầy độ 3'),
	('tung5', '02-12-2021 00:39:18', 123, 123, 81.30081300813009, 'Béo phì độ III');
/*!40000 ALTER TABLE `nhapthongtinvaloikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.taikhoan
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `UserID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `MatKhau` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `isAdmin` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.taikhoan: ~16 rows (approximately)
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` (`UserID`, `MatKhau`, `isAdmin`) VALUES
	('abcd', '12345', 'NO'),
	('admin', '12345', 'YES'),
	('asas', '12345', 'NO'),
	('nhuan1234', '12345', 'NO'),
	('nhuan12345', '12345', 'NO'),
	('nhuan123456', '1234', 'NO'),
	('nhuan1234567', '123456', 'NO'),
	('nhuan512', '12345', 'NO'),
	('nt0000', '12345', 'NO'),
	('nt0123', '12345', 'NO'),
	('nt01234', '123456', 'NO'),
	('tung', '5122001', 'NO'),
	('tung5', '5122001', 'NO'),
	('tungabc', '12345', 'NO'),
	('tungbv', '5122001', 'NO'),
	('tungbv123', '12345', 'NO');
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.trungtam
CREATE TABLE IF NOT EXISTS `trungtam` (
  `IDTrungTam` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenTrungTam` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Tinh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChiCuThe` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDienThoai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDTrungTam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.trungtam: ~32 rows (approximately)
/*!40000 ALTER TABLE `trungtam` DISABLE KEYS */;
INSERT INTO `trungtam` (`IDTrungTam`, `TenTrungTam`, `Tinh`, `DiaChiCuThe`, `SoDienThoai`) VALUES
	('123456789', 'Fitnessssss', 'Ha Noi', ' Dan Phuong', '0123123123'),
	('A000001', 'FITNESS', 'TP Hồ Chí Minh', 'CỤ THỂ', '0123123123'),
	('DP0001', 'Fitness', 'Hà Nội', 'Cụ thể', '0123123123'),
	('HNAKFPHT', 'AK Fitness Phạm Hồng Thái', 'Hà Nội', '28A Phạm Hồng Thái, Ba Đình', '0916001686'),
	('HNAUFNK', 'Aesthetic Ultimate Fitness Ngọc Khánh', 'Hà Nội', 'Tầng 5, số 168 Ngọc Khánh, Ba Đình', '0934486567'),
	('HNBEF&Y', 'BigBox Energy Fitness & Yoga', 'Hà Nội', 'Số 1 Phạm Huy Thông, Ngọc Khánh, Ba Đình', '02439532222'),
	('HNBGPVD', 'Blue Gym', 'Hà Nội', 'Tầng 03- 2T – Số 09 Phạm Văn Đồng, Doãn Kế Thiện', '0933570990'),
	('HNBSF&Y', 'Body Style Fitness & Yoga', 'Hà Nội', '343 Đội Cấn, phường Liễu Giai, quận Ba Đình', '0989199180'),
	('HNC2G', 'C2 Gym', 'Hà Nội', '93A Cầu Giấy, Quan Hoa, Cầu Giấy', '01666990000'),
	('HNCFN', 'California', 'Hà Nội', 'Tầng 3 & Tầng 4, Tòa nhà Long Giang, 173 Xuân Thủy', '02473094999'),
	('HNDCGC', 'Duy Charly Gym Club', 'Hà Nội', '1070 Đê La Thành, Ngọc Khánh, Ba Đình', '0937327273'),
	('HNGC', 'Gin’s Class', 'Hà Nội', 'Tầng 5 nhà C số 22 Thành Công', '01252971965'),
	('HNGCKM', 'Gym CURVES Kim Mã', 'Hà Nội', 'Tầng 2, tòa nhà DMC, 535 Kim Mã, Ba Đình', '02437246760'),
	('HNGCLH', 'Gym Curves Láng Hạ', 'Hà Nội', 'Tầng 6, số 8 Láng Hạ, Thành Công, Ba Đình', '0962284042'),
	('HNGCTH', 'Gym Curves Trung Hòa', 'Hà Nội', 'Tầng 3 – 29T2 Hoàng Đạo Thúy, Trung Hòa, Cầu Giấy', '0367298952'),
	('HNGMDFLF', 'Gym MD FITNESS – Life Fitness', 'Hà Nội', 'TẦNG 2 TÒA NHÀ CT1 VIMECO NGUYỄN CHÁNH, Cầu Giấy', '0916099666'),
	('HNGMDFLFVC', 'Gym MD FITNESS – Life Fitness Văn Cao', 'Hà Nội', 'Ngã tư Văn Cao, Thụy Khuê, Ba Đình', '0916099666'),
	('HNGMF', 'Gym M-Fitness', 'Hà Nội', '163 Hoàng Ngân, Trung Hòa, Cầu Giấy', '0961184389'),
	('HNGTCG', 'Gym Texas Cầu Giấy', 'Hà Nội', '76 Duy Tân, Cầu Giấy', '0977198484'),
	('HNGTHTVF', 'Gym Thể Hình Tuấn Vũ Fitness', 'Hà Nội', 'Tầng 4 tòa nhà Kim Long, 22 Thành Công, Ba Đình', '0917510022'),
	('HNGTVF', 'Gym Tuấn vũ Fitness', 'Hà Nội', 'Tầng 1 toà nhà N4C Trung Hoà, Nhân Chính', '0936074626'),
	('HNGTVF&YC', 'Gym Tuan Vu Fitness & Yoga Center', 'Hà Nội', '139 Cầu Giấy', '0917510022'),
	('HNHGNTH', 'Heros Gym Nguyễn Thái Học', 'Hà Nội', '7 nguyễn thái học, quận Ba Đình', '0857099009'),
	('HNLNF', 'Lightning Fitness', 'Hà Nội', '189 Hoàng Hoa Thám, Ba Đình', '0979012887'),
	('HNMG&TVF', 'Master Gym & Tuấn Vũ Fitness', 'Hà Nội', ' Số 6 Trần Quốc Hoàn, Cầu Giấy', '0942864555'),
	('HNPSF&Y', 'Prana Star Fitness & Yoga', 'Hà Nội', 'Tầng M, tháp Ngôi Sao, Dương Đình Nghệ, Cầu Giấy', '02462949966'),
	('HNSBD', 'Swequity Ba Đình', 'Hà Nội', '523 Kim Mã, Ba Đình', '0965963131'),
	('HNTGBD', 'TopGym quận Ba Đình', 'Hà Nội', 'SỐ 1A, Nguyễn Khắc Nhu, Phường Trúc Bạch, Ba Đình ', '0971011768'),
	('HNTLHNK', 'Thăng Long HN Kendo', 'Hà Nội', 'Ngõ 140 Giảng Võ', '0932311357'),
	('HNTTGCHHT', 'TITAN GYM CLUB Hoàng Hoa Thám', 'Hà Nội', '722 Hoàng Hoa Thám, Ba Đình', '0947796447'),
	('HNUY&D', 'UNIFY yoga & dance', 'Hà Nội', '299 Trung Kính, Yên Hòa, Cầu Giấy', '0911225639'),
	('HNVF&YHHT', 'Vital Fitness & Yoga Hoàng Hoa Thám', 'Hà Nội', 'Tầng 4 tòa nhà 671 Hoàng Hoa Thám, Ba Đình', '0948881683');
/*!40000 ALTER TABLE `trungtam` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.user
CREATE TABLE IF NOT EXISTS `user` (
  `UserID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoDem` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ten` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgaySinh` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SDT` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.user: ~15 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`UserID`, `HoDem`, `Ten`, `NgaySinh`, `DiaChi`, `SDT`) VALUES
	('abcd', 'Bui Van', 'Tung', '09-12-2021', 'Ha Noi', '0123456789'),
	('asas', 'kdfhjsg', 'hajskgdf', '09-12-2021', 'fdgdrsfgfdsg', '0123456789'),
	('nhuan1234', 'Bui ghf', 'Nhuan', '20-07-2001', 'Phu Tho', '0329689087'),
	('nhuan12345', 'Bui', 'Nhuan', '20-07-2001', 'Phu Tho', '0329689087'),
	('nhuan123456', 'Bùi Văn', 'Tùng', '05-12-2001', 'Đan Phượng - Hà Nội', '0986420512'),
	('nhuan1234567', 'Bùi', 'Nhuận', '20-07-2007', 'Phú Thọ', '0329689087'),
	('nhuan512', 'dfgfd', 'dfgddfg', '01-12-2021', 'dsfdsf', '0123123123'),
	('nt0000', 'nt', 'h', '20-07-2001', 'Phú Thọ', '0329689087'),
	('nt0123', 'Bùi', 'Nhuận', '20-07-2001', 'Phú Thọ', '0329689087'),
	('nt01234', 'Bùi ', 'Nhuận', '20-07-2001', 'Phú Thọ', '0329689087'),
	('tung', 'Bùi Văn', 'Tùng', '05-12-2001', 'Đan Phượng - Hà Nội', '0123123123'),
	('tung5', 'bui van', 'tung', '07-12-2021', 'dan phuong', '0123456789'),
	('tungabc', 'bui van', 'tung', '03-12-2021', 'fdgfdg', '0123123123'),
	('tungbv', 'Bùi Văn', 'Tùng', '05-12-2001', 'Đan Phượng Hà Nội', '012312312'),
	('tungbv123', 'Bui Van Tung', 'Tung', '03-12-2021', 'hhhhhhh', '0123456789');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
