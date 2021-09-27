CREATE TABLE `grades`
(
    `id`                      BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`                    VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the grade.',
    `approximate_start_month` INT                                            NOT NULL COMMENT 'Approximate start month of the grade.',
    `approximate_start_day`   INT                                            NOT NULL COMMENT 'Approximate start day of month year of the grade.',
    `approximate_end_month`   INT                                            NOT NULL COMMENT 'Approximate end month of the grade.',
    `approximate_end_day`     INT                                            NOT NULL COMMENT 'Approximate end day of month year of the grade.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of grades.';