-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Jeu 23 Mai 2019 à 16:14
-- Version du serveur: 5.6.11-log
-- Version de PHP: 5.4.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `gestibankn`
--

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE IF NOT EXISTS `compte` (
  `numCompte` int(11) NOT NULL AUTO_INCREMENT,
  `dateCreate` date NOT NULL,
  `decouvert` double NOT NULL,
  `plafond` double NOT NULL,
  `solde` double NOT NULL,
  `typeCompte` varchar(255) NOT NULL,
  PRIMARY KEY (`numCompte`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`numCompte`, `dateCreate`, `decouvert`, `plafond`, `solde`, `typeCompte`) VALUES
(1, '2010-06-12', 700, 0, 200, 'Avec Decouvert'),
(2, '2010-06-12', 700, 0, 200, 'Avec Decouvert'),
(3, '2010-06-12', 700, 0, 200, 'Avec Decouvert'),
(4, '2010-06-12', 700, 0, 200, 'Avec Decouvert');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
