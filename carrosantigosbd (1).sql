-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Nov-2022 às 22:03
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `carrosantigosbd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

CREATE TABLE `carro` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `ano` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `potencia` varchar(50) NOT NULL,
  `imagem` varchar(150) NOT NULL,
  `codigousuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`codigo`, `nome`, `modelo`, `ano`, `marca`, `potencia`, `imagem`, `codigousuario`) VALUES
(13, 'Chevrolet Opala', 'Opala SS', 1974, 'Opala SS', '140CV', 'https://quatrorodas.abril.com.br/wp-content/uploads/2021/08/GE2B8378-HDR-e1630725781589.jpg', NULL),
(15, 'GM C10', 'C10', 1975, 'C10', '151 CV', 'https://quatrorodas.abril.com.br/wp-content/uploads/2020/11/C-10-modelo-1974-da-Chevrolet._1-C%C3%B3pia.jpg', NULL),
(16, 'VW FUSCA', 'Fusca 1300 L', 1976, 'Fusca 1300 L', '46 CV', 'https://fotos.jornaldocarro.estadao.com.br/uploads/2018/06/30151604/41545551-1160x773.jpg', NULL),
(17, 'CHEV STANDARD', 'Chevette Standard 1.4', 1982, 'Chevette Standard 1.4', '65 CV', 'https://upload.wikimedia.org/wikipedia/commons/8/8c/1981_chevette.jpg', NULL),
(18, 'KARMANN GHIA', 'GHIA TYP 34 ', 1968, 'GHIA TYP 34 ', '65 cv', 'https://classicmoto.rs/cdn/thmbs/07/41/0741ef110b3a6109dbd44c2e15056f7d.jpg', NULL),
(19, 'COMODORO', 'Comodoro 4100', 1980, 'Comodoro 4100', '171 CV', 'https://motortudo.com/wp-content/uploads/2019/12/Opala-Comodoro-4100-1979-Motor-Tudo-2-1024x683.jpg', NULL),
(21, 'CABRIOLET', '325i Cabriolet', 1995, '325i Cabriolet', '192 CV', 'https://www.planetcarsz.com/assets/uploads/2015/01/BMW%203%20SERIES%20CONVERTIBLE%20325I%201985%2001.jpg', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `nome` varchar(70) NOT NULL,
  `email` varchar(70) NOT NULL,
  `senha` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Tonilson ', 'tonilsonmanoel@gmail.com', 'tonix1999'),
(2, 'tainara', 'tainara2003@gmail.com', 'tainara2003'),
(3, 'teste', 'teste@gmail.com', '1234'),
(4, 'enilça', 'enilcaconceicao@gmail.com', 'enilca86'),
(5, 'Taniellen Silva', 'taniellensilva@gmail.com', '1234');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `carro`
--
ALTER TABLE `carro`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carro`
--
ALTER TABLE `carro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
