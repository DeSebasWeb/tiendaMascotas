-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-06-2024 a las 20:17:58
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida_g`
--

CREATE TABLE `comida_g` (
  `com_codigo` varchar(6) NOT NULL COMMENT 'Tipo codigo de barras, introducelo de 6 digitos',
  `com_marca` varchar(20) NOT NULL COMMENT 'Marca de la comida',
  `com_precio` double NOT NULL,
  `com_tamaño` varchar(20) NOT NULL COMMENT 'tipo cachorro o adulto',
  `com_especial` varchar(60) NOT NULL COMMENT 'Nombrar si es comida especial, tipo comida con cuidado para la piel o riñones, etc.',
  `com_descripcion` varchar(120) NOT NULL COMMENT 'descripcion de la comida',
  `com_cantidad` int(60) NOT NULL COMMENT 'Cantidad del producto'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida_g`
--

INSERT INTO `comida_g` (`com_codigo`, `com_marca`, `com_precio`, `com_tamaño`, `com_especial`, `com_descripcion`, `com_cantidad`) VALUES
('44528', 'Catchow', 6000, 'adulto', 'si', 'Es una comida para gatos castrados ', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida_p`
--

CREATE TABLE `comida_p` (
  `com_codigo` varchar(6) NOT NULL COMMENT 'Tipo codigo de barras, introducir 6 digitos',
  `com_marca` varchar(20) NOT NULL COMMENT 'Marca comida',
  `com_precio` double NOT NULL,
  `com_tamaño` varchar(20) NOT NULL COMMENT 'Tipo cachorro o adulto',
  `com_especial` varchar(50) NOT NULL COMMENT 'Nombrar si es comida especial',
  `com_descripcion` varchar(120) NOT NULL COMMENT 'Descripción de la comida',
  `com_cantidad` varchar(20) NOT NULL COMMENT 'Cantidad de los productos'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida_p`
--

INSERT INTO `comida_p` (`com_codigo`, `com_marca`, `com_precio`, `com_tamaño`, `com_especial`, `com_descripcion`, `com_cantidad`) VALUES
('44584', 'Dogchow', 5000, 'cachorro', 'no', 'La comida es para perros yorky miniatura cachorros', '5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juguete_g`
--

CREATE TABLE `juguete_g` (
  `jug_codigo` varchar(6) NOT NULL,
  `jug_nombre` varchar(20) NOT NULL,
  `jug_precio` double NOT NULL,
  `jug_descripcion` varchar(120) NOT NULL,
  `jug_cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `juguete_g`
--

INSERT INTO `juguete_g` (`jug_codigo`, `jug_nombre`, `jug_precio`, `jug_descripcion`, `jug_cantidad`) VALUES
('785910', 'Gimnasio', 75000, 'Gimnasio para gato adulto ', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juguete_p`
--

CREATE TABLE `juguete_p` (
  `jug_codigo` varchar(6) NOT NULL,
  `jug_nombre` varchar(20) NOT NULL,
  `jug_precio` double NOT NULL,
  `jug_descripcion` varchar(120) NOT NULL,
  `jug_cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `juguete_p`
--

INSERT INTO `juguete_p` (`jug_codigo`, `jug_nombre`, `jug_precio`, `jug_descripcion`, `jug_cantidad`) VALUES
('66458', 'Pelota de plastico', 5000, 'pelota resistente para el uso en exteriores', 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida_g`
--
ALTER TABLE `comida_g`
  ADD PRIMARY KEY (`com_codigo`);

--
-- Indices de la tabla `comida_p`
--
ALTER TABLE `comida_p`
  ADD PRIMARY KEY (`com_codigo`);

--
-- Indices de la tabla `juguete_g`
--
ALTER TABLE `juguete_g`
  ADD PRIMARY KEY (`jug_codigo`);

--
-- Indices de la tabla `juguete_p`
--
ALTER TABLE `juguete_p`
  ADD PRIMARY KEY (`jug_codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
