CREATE TABLE `teacher_question_likes`
(
    `id`            BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`    BIGINT   NOT NULL COMMENT 'ID of the teacher who rates the question.',
    `question_id`   BIGINT   NOT NULL COMMENT 'ID of the question.',
    `creation_time` DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `likes`         TINYINT  NOT NULL COMMENT 'Whether the teacher likes the question, 1: like, 2: unlike.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8_mb4
    COLLATE utf8_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of teacher question likes/unlikes.';