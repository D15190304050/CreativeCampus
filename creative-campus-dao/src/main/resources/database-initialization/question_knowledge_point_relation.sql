CREATE TABLE `question_knowledge_point_relation`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `question_id`        BIGINT NOT NULL COMMENT 'Question id of this relation.',
    `knowledge_point_id` BIGINT NOT NULL COMMENT 'Knowledge point of this relation.',
    PRIMARY KEY (`id`),
    KEY `idx_question_id` (`question_id`),
    KEY `idx_knowledge_point_id` (`knowledge_point_id`)
)
    ENGINE = INNODB
    AUTO_INCREMENT = 1
    COMMENT 'Information of table_name.';