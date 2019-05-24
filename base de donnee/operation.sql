-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Ven 24 Mai 2019 à 10:31
-- Version du serveur: 5.6.11-log
-- Version de PHP: 5.4.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `gestibank`
--

-- --------------------------------------------------------

--
-- Structure de la table `operation`
--

CREATE TABLE IF NOT EXISTS `operation` (
  `idOp` int(11) NOT NULL AUTO_INCREMENT,
  `dateOp` datetime NOT NULL,
  `libelleOp` varchar(255) NOT NULL,
  `montantOp` float NOT NULL,
  `typeOp` char(1) NOT NULL,
  PRIMARY KEY (`idOp`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `operation`
--

INSERT INTO `operation` (`idOp`, `dateOp`, `libelleOp`, `montantOp`, `typeOp`) VALUES
(1, '2010-06-12 00:00:00', 'Carte Bancaire', 20, 'D'),
(2, '2010-06-12 00:00:00', 'Carte Bancaire', 20, 'D');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
