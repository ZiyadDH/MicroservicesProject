Projet de microservices
Ce projet illustre une architecture de microservices composée de plusieurs services, dont un service de voiture, un service client, une passerelle, et un service Eureka.

Services
Service de Voiture
Le Service de Voiture est responsable de la gestion des données liées aux voitures. Il propose des opérations CRUD pour la création, la lecture, la mise à jour et la suppression des informations sur les voitures.

Service Client
Le Service Client gère les fonctionnalités liées aux clients. Il gère les données des clients et fournit des APIs pour la gestion des informations client, telles que la création de clients, la récupération des détails des clients et la mise à jour des informations client.

Passerelle
La Passerelle sert de point d'entrée à l'écosystème de microservices. Elle achemine les requêtes entrantes des clients vers le service approprié en fonction du point d'accès spécifié.

Service Eureka
Le Service Eureka fournit des capacités de découverte de service et d'enregistrement en utilisant le framework Eureka. Il permet aux autres services de s'enregistrer et de découvrir d'autres services dans l'architecture de microservices.

Technologies Utilisées
Java
Spring Boot
Spring Cloud
Eureka
Prérequis
Assurez-vous d'avoir les éléments suivants installés :

Kit de développement Java (JDK)
Maven
Postman