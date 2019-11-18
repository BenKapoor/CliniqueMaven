-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 18 nov. 2019 à 12:07
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `cliniquemaven`
--
CREATE DATABASE IF NOT EXISTS `cliniquemaven` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cliniquemaven`;

-- --------------------------------------------------------

--
-- Structure de la table `medecin`
--

DROP TABLE IF EXISTS `medecin`;
CREATE TABLE IF NOT EXISTS `medecin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `sexe` tinyint(1) NOT NULL,
  `email` varchar(255) NOT NULL,
  `specialite` varchar(255) NOT NULL,
  `idPatient` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idPatient` (`idPatient`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `medecin`
--

INSERT INTO `medecin` (`id`, `nom`, `prenom`, `adresse`, `sexe`, `email`, `specialite`, `idPatient`) VALUES
(1, 'Dr', 'Tournesol', '15 rue de Bernard de la Vilardière', 0, '', '', 1),
(2, 'Dr', 'Alban', 'Rue de la pompe', 0, '', '', NULL),
(3, 'Dr', 'Alban', 'Rue de la pompe', 0, '', '', NULL),
(4, 'Dr', 'Alban', 'Rue de la pompe', 0, '', '', NULL),
(5, 'Dr', 'Alban', 'Rue de la pompe', 0, '', '', NULL),
(6, 'Dr', 'Alban', 'Rue de la pompe', 0, '', '', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `sexe` tinyint(1) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `patient`
--

INSERT INTO `patient` (`id`, `nom`, `prenom`, `adresse`, `sexe`, `email`) VALUES
(1, 'Jean', 'Marc', '13 rue de la bière', 0, '');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `medecin`
--
ALTER TABLE `medecin`
  ADD CONSTRAINT `medecin_ibfk_1` FOREIGN KEY (`idPatient`) REFERENCES `patient` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
