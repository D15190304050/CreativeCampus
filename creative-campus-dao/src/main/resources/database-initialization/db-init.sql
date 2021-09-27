CREATE TABLE `administrators`
(
    `id`         BIGINT AUTO_INCREMENT COMMENT 'ID of the administrator.',
    `account_id` BIGINT NOT NULL COMMENT 'ID of the associated account.',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of administrators.';
CREATE TABLE `classes`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the class.',
    `major_id`           BIGINT                                                    DEFAULT 0 COMMENT 'Major id of the class.',
    `start_date`         DATE                                             NOT NULL COMMENT 'Start date of the class.',
    `end_date`           DATE                                             NOT NULL COMMENT 'End date of the class.',
    `creator_id`         BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the class.',
    `update_operator_id` BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_major_id` (`major_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of classes.';
CREATE TABLE difficulty_types
(
    `id`          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`        VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the difficulty type.',
    `description` VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Description of the table_name.',

    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of difficulty types.';
CREATE TABLE `disciplines`
(
    `id`                   BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`                 VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the discipline.',
    `description`          VARCHAR(500) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Description of the discipline.',
    `parent_discipline_id` BIGINT                                                    DEFAULT -1 COMMENT 'ID of parent discipline of this discipline.',
    `level`                INT                                              NOT NULL COMMENT 'Level of the discipline.',
    `creator_id`           BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`        DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`   BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`          DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_parent_discipline_id` (`parent_discipline_id`),
    KEY `idx_level` (`level`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of disciplines.';
CREATE TABLE `favorite_types`
(
    `id`          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`        VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `description` VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of favorite types.';
CREATE TABLE `follow_relation`
(
    `id`                     BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `source_account_id`      BIGINT   NOT NULL COMMENT 'Source account id.',
    `destination_account_id` BIGINT   NOT NULL COMMENT 'Destination account id.',
    `start_time`             DATETIME NOT NULL DEFAULT NOW() COMMENT 'Start time of the follow relation.',
    PRIMARY KEY (`id`),
    KEY `idx_source_account_id` (`source_account_id`),
    KEY `idx_destination_account_id` (`destination_account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of table_name.';
CREATE TABLE `grades`
(
    `id`                      BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`                    VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the grade.',
    `approximate_start_month` INT                                              NOT NULL COMMENT 'Approximate start month of the grade.',
    `approximate_start_day`   INT                                              NOT NULL COMMENT 'Approximate start day of month year of the grade.',
    `approximate_end_month`   INT                                              NOT NULL COMMENT 'Approximate end month of the grade.',
    `approximate_end_day`     INT                                              NOT NULL COMMENT 'Approximate end day of month year of the grade.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of grades.';
CREATE TABLE `homework`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the homework.',
    `description`        VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Description of the homework.',
    `discipline_id`      BIGINT                                           NOT NULL COMMENT 'ID of the discipline that the homework belongs to',
    `homework_body_url`  VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'URL of the homework body.',
    `creator_id`         BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_discipline_id` (`discipline_id`),
    KEY `idx_creator_id` (`creator_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of homework.';
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
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of homework comments.';
CREATE TABLE `knowledge_points`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `discipline_id`      BIGINT                                           NOT NULL COMMENT 'ID of the discipline that the knowledge point belongs to.',
    `name`               VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the knowledge point.',
    `description_url`    VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'URL of the description of the knowledge point.',
    `grade_id`           BIGINT                                           NOT NULL COMMENT 'ID of the grade when students learn the knowledge point.',
    `semester_id`        BIGINT                                           NOT NULL COMMENT 'ID of the semester when students learn the knowledge point.',
    `frequency_of_exams` DOUBLE                                           NOT NULL COMMENT 'Frequency of the knowledge appear in exams.',
    `creator_id`         BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_discipline_id` (`discipline_id`),
    KEY `idx_grade_semester` (`grade_id`, `semester_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of knowledge points.';
CREATE TABLE `knowledge_point_prerequisites`
(
    `id`                              BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `knowledge_point_id`              BIGINT   NOT NULL COMMENT 'ID of the current point',
    `prerequisite_knowledge_point_id` BIGINT   NOT NULL COMMENT 'ID of the knowledge point that is a prerequisite of the current knowledge point',
    `creator_id`                      BIGINT   NOT NULL COMMENT 'ID of the creator.',
    `creation_time`                   DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`              BIGINT   NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`                     DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_knowledge_point_id` (`knowledge_point_id`),
    KEY `idx_prerequisite_knowledge_point_id` (`prerequisite_knowledge_point_id`)
)
    ENGINE = INNODB
    AUTO_INCREMENT = 1
    COMMENT 'Information of knowledge point prerequisites.';
CREATE TABLE `knowledge_point_question_labels`
(
    `id`                  BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`                VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the label.',
    `recent_frequency_id` BIGINT                                           NOT NULL COMMENT 'Frequency of occurrence of the label in recent.',
    `creator_id`          BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`       DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`  BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`         DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of labels.';
CREATE TABLE `majors`
(
    `id`            BIGINT AUTO_INCREMENT COMMENT 'ID of the major.',
    `name`          VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the major',
    `discipline_id` BIGINT                                           NOT NULL COMMENT 'ID of the discipline that the major belongs to.',
    `description`   VARCHAR(500) CHARSET utf8mb4 COLLATE utf8mb4_bin COMMENT 'Description of the major',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_name` (`name`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of majors.';
CREATE TABLE `questions`
(
    `id`                       BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `source_type_id`           INT                                              NOT NULL COMMENT 'Source type of the question, 0-reprint, 1-original',
    `question_type_id`         BIGINT                                           NOT NULL COMMENT 'ID of the question type.',
    `difficulty_type_id`       BIGINT                                           NOT NULL COMMENT 'ID of the difficulty of the question',
    `question_body_url`        VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'URL of the question body.',
    `discipline_id`            BIGINT                                           NOT NULL COMMENT 'ID of the discipline that the question belongs to.',
    `answer_body_url`          VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'URL of the answer body of the question.',
    `estimated_time_to_finish` INT                                              NOT NULL COMMENT 'Estimated time to finish the question, unit: seconds.',
    `tag`                      VARCHAR(500) CHARSET utf8mb4 COLLATE utf8mb4_bin          DEFAULT NULL COMMENT 'Other information of this question.',
    `creator_id`               BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`            DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`       BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`              DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_creator_id` (`creator_id`),
    KEY `idx_discipline_id` (`discipline_id`),
    KEY `idx_difficulty_type_id` (`difficulty_type_id`),
    KEY `idx_question_type_id` (`question_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of questions.';
CREATE TABLE `question_comments`
(
    `id`                          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `question_id`                 BIGINT   NOT NULL COMMENT 'ID of the question of the comment.',
    `pre_question_comment_id`     BIGINT   NOT NULL COMMENT 'ID of the pre question comment.',
    `question_comment_content_id` BIGINT   NOT NULL COMMENT 'ID of the comment content.',
    `account_id`                  BIGINT   NOT NULL COMMENT 'ID of the account that provides the comment.',
    `publish_time`                DATETIME NOT NULL COMMENT 'Time of the publish of the comment.',
    `is_deleted`                  BOOLEAN  NOT NULL COMMENT 'A flag indicating if the comment is deleted.',
    PRIMARY KEY (`id`),
    KEY `idx_question_id` (`question_id`),
    KEY `idx_account_id` (`account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of question comments.';
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
CREATE TABLE `question_types`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `description`        VARCHAR(200)                                     NOT NULL DEFAULT '' COMMENT 'Simple description of the frequency, such as "Select the correct option."',
    `creator_id`         BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of question types.';
CREATE TABLE `teacher_recent_activities`
(
    `id`               BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`       BIGINT                                           NOT NULL COMMENT 'ID of the teacher.',
    `activity_type_id` BIGINT                                           NOT NULL COMMENT 'ID of the type of activity.',
    `activity_detail`  VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `time`             DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Time of occurrence.',
    PRIMARY KEY (`id`),
    KEY `idx_teacher_id` (`teacher_id`),
    KEY `idx_activity_type_id` (`activity_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of recent activities of teachers.';
CREATE TABLE `recent_frequencies`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the frequency label.',
    `description`        VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Description of the frequency.',
    `creator_id`         BIGINT                                           NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                           NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of recent frequencies.';
CREATE TABLE `recent_visits`
(
    `id`                BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`        BIGINT   NOT NULL COMMENT 'ID of the teacher.',
    `visit_type_id`     BIGINT   NOT NULL COMMENT 'ID of type of the visit.',
    `visited_object_id` BIGINT   NOT NULL COMMENT 'ID of the object that is visited.',
    `time`              DATETIME NOT NULL DEFAULT NOW() COMMENT 'Time of occurrence.',
    PRIMARY KEY (`id`),
    KEY `idx_teacher_id` (`teacher_id`),
    KEY `idx_visit_type_id` (`visit_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of recent visits.';
CREATE TABLE `schools`
(
    `id`   BIGINT AUTO_INCREMENT COMMENT 'ID of the school.',
    `name` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the school.',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_name` (`name`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of schools.';
CREATE TABLE `semesters`
(
    `id`                      BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`                    VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the semester.',
    `approximate_start_month` INT                                              NOT NULL COMMENT 'Approximate start month of the grade.',
    `approximate_start_day`   INT                                              NOT NULL COMMENT 'Approximate start day of month year of the grade.',
    `approximate_end_month`   INT                                              NOT NULL COMMENT 'Approximate end month of the grade.',
    `approximate_end_day`     INT                                              NOT NULL COMMENT 'Approximate end day of month year of the grade.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of semesters.';
CREATE TABLE `students`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'ID of the student.',
    `student_number`     VARCHAR(100) NOT NULL COMMENT 'Student number of the student.',
    `name`               VARCHAR(200) NOT NULL COMMENT 'Name of the student',
    `class_id`           BIGINT       NOT NULL COMMENT 'ID of the class that the student belongs to.',
    `start_date`         DATE         NOT NULL COMMENT 'Start date of the student in the class (instead of in the school).',
    `end_date`           DATE         NOT NULL COMMENT 'End date of the student in the class (instead of in the school).',
    `creator_id`         BIGINT       NOT NULL COMMENT 'ID of the creator who adds this record.',
    `creation_time`      DATETIME     NOT NULL DEFAULT NOW() COMMENT 'Creation time of this record.',
    `update_operator_id` BIGINT       NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME     NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_class_id` (`class_id`),
    UNIQUE KEY `idx_unique_class_id_student_number` (`class_id`, `student_number`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of students.';
CREATE TABLE `teachers`
(
    `id`                               BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `account`                          VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the account.',
    `nickname`                         VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name to display.',
    `avatar_url`                       VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'URL of the avatar.',
    `phone_number`                     VARCHAR(020) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Phone number of the teacher.',
    `email`                            VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin COMMENT 'Email of the teacher.',
    `encrypted_password`               VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Encrypted password.',
    `password_encryption_algorithm_id` INT                                              NOT NULL DEFAULT 0 COMMENT 'ID of the encryption algorithm for password.',
    `creation_time`                    DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_time`                      DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_account` (`account`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of teacher accounts.';
CREATE TABLE `teacher_favorite_collection_contents`
(
    `id`            BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `collection_id` BIGINT   NOT NULL COMMENT 'ID of the favorite collection.',
    `content_id`    BIGINT   NOT NULL COMMENT 'ID of the content in the collection.',
    `creation_time` DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_time`   DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_collection_id` (`collection_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of favorite collection contents of teachers.';
CREATE TABLE `teacher_favorite_collections`
(
    `id`               BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`       BIGINT                                           NOT NULL COMMENT 'ID of the teacher.',
    `favorite_type_id` BIGINT                                           NOT NULL COMMENT 'ID of type of favorites.',
    `name`             VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `creation_time`    DATETIME                                         NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_time`      DATETIME                                         NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_teacher_id` (`teacher_id`),
    KEY `idx_favorite_type_id` (`favorite_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of favorite collections of teachers.';
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
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of teacher question likes/unlikes.';
CREATE TABLE ugc_source_types
(
    `id`          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`        VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the ugc source type.',
    `description` VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of ugc source types, actually only 2 types are needed, reprint and original.';
CREATE TABLE `visit_types`
(
    `id`          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`        VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `description` VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of visit types.';