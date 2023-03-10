-- phpMyAdmin SQL Dump
-- version 4.7.3
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Час створення: Бер 10 2023 р., 19:28
-- Версія сервера: 5.6.37
-- Версія PHP: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База даних: `tickets`
--

-- --------------------------------------------------------

--
-- Структура таблиці `tickets`
--

CREATE TABLE `tickets` (
  `tickets_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `move` double DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `cnb_mid` double DEFAULT NULL,
  `curr_buy` double DEFAULT NULL,
  `curr_mid` double DEFAULT NULL,
  `curr_sell` double DEFAULT NULL,
  `ecb_mid` double DEFAULT NULL,
  `short_name` varchar(255) DEFAULT NULL,
  `val_buy` double DEFAULT NULL,
  `val_mid` double DEFAULT NULL,
  `val_sell` double DEFAULT NULL,
  `valid_from` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп даних таблиці `tickets`
--

INSERT INTO `tickets` (`tickets_id`, `name`, `country`, `move`, `amount`, `version`, `cnb_mid`, `curr_buy`, `curr_mid`, `curr_sell`, `ecb_mid`, `short_name`, `val_buy`, `val_mid`, `val_sell`, `valid_from`) VALUES
(1, 'Dollar', 'Australia', -0.5, 1, 1, 16.31, 15.898, 16.306, 16.714, 1.497, 'AUD', 15.74, 16.306, 16.88, '2022-04-26 00:00:00'),
(2, 'Rand', 'South Africa', 0, 1, 1, 1.449, 1.409, 1.445, 1.482, 16.855, 'ZAR', 0, 0, 0, '2022-04-26 00:00:00'),
(3, 'Dollar', 'Canada', 0.52, 1, 1, 17.814, 17.418, 17.865, 18.312, 1.371, 'CAD', 17.24, 17.865, 18.49, '2022-04-26 00:00:00'),
(4, 'Franc', 'Switzerland', 1.13, 1, 1, 23.784, 23.224, 23.82, 24.415, 1.027, 'CHF', 22.99, 23.82, 24.65, '2022-04-26 00:00:00'),
(5, 'Krone', 'Denmark', 0.37, 1, 1, 3.283, 3.202, 3.284, 3.366, 7.439, 'DKK', 3.17, 3.284, 3.4, '2022-04-26 00:00:00'),
(6, 'Euro', 'EU', 0.37, 1, 1, 24.42, 23.819, 24.43, 25.041, 0, 'EUR', 23.57, 24.43, 25.29, '2022-04-26 00:00:00'),
(7, 'Pound', 'Great Britain', 0.03, 1, 1, 28.956, 28.303, 29.028, 29.754, 0.843, 'GBP', 28.01, 29.028, 30.04, '2022-04-26 00:00:00'),
(8, 'Dollar', 'Hong Kong', 1.04, 1, 1, 2.896, 2.832, 2.905, 2.978, 8.433, 'HKD', 0, 0, 0, '2022-04-26 00:00:00'),
(9, 'Kuna', 'Croatia', 0.37, 1, 1, 3.23, 3.149, 3.23, 3.311, 7.562, 'HRK', 3.12, 3.23, 3.34, '2022-04-26 00:00:00'),
(10, 'Forint', 'Hungary', -0.37, 100, 1, 6.528, 6.368, 6.531, 6.694, 37408, 'HUF', 6.3, 6.531, 6.76, '2022-04-26 00:00:00'),
(11, 'Yen', 'Japan', 1.36, 100, 1, 17.729, 17.377, 17.823, 18.268, 13773, 'JPY', 17.2, 17.823, 18.45, '2022-04-26 00:00:00'),
(12, 'Krone', 'Norway', -0.99, 1, 1, 2.517, 2.437, 2.499, 2.562, 9.702, 'NOK', 2.41, 2.499, 2.59, '2022-04-26 00:00:00'),
(13, 'Dollar', 'New Zealand', 0.53, 1, 1, 15.037, 14.674, 15.05, 15.426, 1.624, 'NZD', 0, 0, 0, '2022-04-26 00:00:00'),
(14, 'Złoty', 'Poland', 0.31, 1, 1, 5.264, 5.123, 5.255, 5.386, 4.64, 'PLN', 5.07, 5.255, 5.44, '2022-04-26 00:00:00'),
(15, 'Leu', 'Romania', 0.33, 1, 1, 4.938, 4.816, 4.939, 5.063, 4.946, 'RON', 0, 0, 0, '2022-04-26 00:00:00'),
(16, 'Krona', 'Sweden', -0.59, 1, 1, 2.36, 2.295, 2.354, 2.413, 10.348, 'SEK', 2.27, 2.354, 2.44, '2022-04-26 00:00:00'),
(17, 'Dinar', 'Tunisia', -0.25, 1, 1, 0, 7.284, 7.471, 7.657, 0, 'TND', 0, 0, 0, '2022-04-26 00:00:00'),
(18, 'Lira', 'Turkey', 0.92, 1, 1, 1.539, 1.504, 1.543, 1.581, 15.864, 'TRY', 0, 0, 0, '2022-04-26 00:00:00'),
(19, 'Dollar', 'USA', 1.07, 1, 1, 22.725, 22.228, 22.798, 23.368, 1.075, 'USD', 22, 22.798, 23.6, '2022-04-26 00:00:00'),
(20, 'Lev', 'Bulgaria', 0.35, 1, 1, 12.486, 12.177, 12.489, 12.802, 1.956, 'BGN', 0, 0, 0, '2022-04-26 00:00:00');

--
-- Індекси збережених таблиць
--

--
-- Індекси таблиці `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`tickets_id`);

--
-- AUTO_INCREMENT для збережених таблиць
--

--
-- AUTO_INCREMENT для таблиці `tickets`
--
ALTER TABLE `tickets`
  MODIFY `tickets_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
