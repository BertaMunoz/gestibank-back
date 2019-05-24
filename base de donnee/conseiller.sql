-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Jeu 23 Mai 2019 à 12:30
-- Version du serveur: 5.6.11-log
-- Version de PHP: 5.4.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `kimtest`
--

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

CREATE TABLE IF NOT EXISTS `conseiller` (
  `mle` int(11) NOT NULL AUTO_INCREMENT,
  `ADRESSE` varchar(255) NOT NULL,
  `CODE_POSTALE` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `NOM` varchar(255) NOT NULL,
  `PRENOM` varchar(255) NOT NULL,
  `TEL` varchar(255) NOT NULL,
  `VILLE` varchar(255) NOT NULL,
  PRIMARY KEY (`mle`),
  UNIQUE KEY `UK_4j9735sjfk2yl7tfmp57y5gsr` (`ADRESSE`),
  UNIQUE KEY `UK_e91jily37u1rhx3l9bhr0os8l` (`CODE_POSTALE`),
  UNIQUE KEY `UK_qhyef705ep9wf7qq70frxg8di` (`TEL`),
  UNIQUE KEY `UK_wt9jwjtfhrt886c8dlwxvqyn` (`VILLE`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `conseiller`
--

INSERT INTO `conseiller` (`mle`, `ADRESSE`, `CODE_POSTALE`, `EMAIL`, `NOM`, `PRENOM`, `TEL`, `VILLE`) VALUES
(1, 'truc', 'truc', 'truc', 'truc', 'truc', 'truc', 'truc'),
(2, 'truc2', 'truc2', 'truc2', 'truc2', 'truc2', 'truc2', 'truc2'),
(3, 'truc3', 'truc3', 'truc3', 'truc3', 'truc3', 'truc3', 'truc3'),
(4, 'truc4', 'truc4', 'truc4', 'truc4', 'truc4', 'truc4', 'truc4');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
