INSERT INTO `client` (`id_client`, `prenom`, `nom`) VALUES (1, 'Admin','Admin');
INSERT INTO `client` (`id_client`, `prenom`, `nom`) VALUES (2, 'Axel','Katz');
INSERT INTO `client` (`id_client`, `prenom`, `nom`) VALUES (3, 'Lucie','Yeung');
INSERT INTO `client` (`id_client`, `prenom`, `nom`) VALUES (4, 'Chenin','Yahi');
INSERT INTO `club` (`id_club`, `name`) VALUES (1, 'Cafe Oz');
INSERT INTO `club` (`id_club`, `name`) VALUES (2, 'La Taverne');
INSERT INTO `club` (`id_club`, `name`) VALUES (3, 'VIP Room');
INSERT INTO `party` (`id_party`, `name`, `theme`,`description`,`capacity`, `id_club`) VALUES (1, 'Back in 80', 'Année 80','Et turbarum traxere post avidi qui divaricaturn innexis ad traxere corpore ullo eius Montium divaricaturn.Et turbarum traxere post avidi qui divaricaturn innexis ad traxere corpore ullo eius Montium divaricaturn.',200,1);
INSERT INTO `party` (`id_party`, `name`, `theme`,`description`, `capacity`,`id_club`) VALUES (2, 'La Nuit de la Désintégration 2020', 'Soirée étudiante','Elogio responderunt occidi responderunt uno ordinis urgenti rationabili constantia perissent.Et turbarum traxere post avidi qui divaricaturn innexis ad traxere corpore ullo eius Montium divaricaturn.',300,2);
INSERT INTO `party` (`id_party`, `name`, `theme`,`description`, `capacity`,`id_club`) VALUES (3, 'PSG vs OM', 'Match de football','Seleucus efficaciae porrigitur porrigitur vero post ad inpetrabilis dextra inEt turbarum traxere post avidi qui divaricaturn innexis ad traxere corpore ullo eius Montium divaricaturn.',150,1);
INSERT INTO `party` (`id_party`, `name`, `theme`,`description`,`capacity`, `id_club`) VALUES (4, 'Flûte et caviar', 'Champagne party','Causae utilitates tamen auxit ac et quidem sic ab in.Et turbarum traxere post avidi qui divaricaturn innexis ad traxere corpore ullo eius Montium divaricaturn.',180,3);
INSERT INTO `booking` (`id_booking`, `id_party`, `id_client`,`nbClient`) VALUES (1, 1, 2, 16);
INSERT INTO `booking` (`id_booking`, `id_party`, `id_client`,`nbClient`) VALUES (2, 1, 3, 6);
INSERT INTO `booking` (`id_booking`, `id_party`, `id_client`,`nbClient`) VALUES (3, 2, 2, 10);
INSERT INTO `booking` (`id_booking`, `id_party`, `id_client`,`nbClient`) VALUES (4, 3, 2, 1);

