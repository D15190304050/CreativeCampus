CREATE TABLE `knowledge_point_prerequisites`
(
    `id`                              BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `knowledge_point_id`              BIGINT   NOT NULL COMMENT 'ID of the current point',
    `prerequisite_knowledge_point_id` BIGINT   NOT NULL COMMENT 'ID of the knowledge point that is a prerequisite of the current knowledge point',
    `creator_id`                      BIGINT   NOT NULL COMMENT 'ID of the creator.',
    `creation_time`                   DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`              BIGINT   NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`                     DATETIME NOT NULL DEFAULT NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_knowledge_point_id` (`knowledge_point_id`),
    KEY `idx_prerequisite_knowledge_point_id` (`prerequisite_knowledge_point_id`)
)
    ENGINE = INNODB
    AUTO_INCREMENT = 1
    COMMENT 'Information of knowledge point prerequisites.';