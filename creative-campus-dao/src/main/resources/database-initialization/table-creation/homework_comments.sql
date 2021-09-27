CREATE TABLE `homework_comments`
(
    `id`                      BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `homework_id`             BIGINT   NOT NULL COMMENT 'ID of the homework.',
    `pre_homework_comment_id` BIGINT COMMENT 'ID of the previous comment.',
    `account_id`              BIGINT   NOT NULL COMMENT 'ID of the creator.',
    `publish_time`            DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `is_deleted`              TINYINT  NOT NULL DEFAULT 0 COMMENT 'Is deleted? 0: No, 1: Yes',
    PRIMARY KEY (`id`),
    KEY `idx_question_id` (`homework_id`),
    KEY `idx_account_id` (`account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of homework comments.';