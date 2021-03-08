# Autor: Hernan Rueda Perez

@stories
Feature: Academy Choucair
  As an user, I want to learn how to automate in screamplay at the Choucair Academy whit the automation course
  @scenario1
  Scenario: Search for a automation curse
    Given than Hernan wants to learn automation at the academy Choucair
    | strUser    | strPassword   |
    | 1090500063 | Choucair2021* |
    When he search for the course on the choucair academy plataform
    | strCourse                  |
    | Workshop de Automatizacion |
    Then he finds the course called resources
    | strCourse                  |
    | Workshop de Automatización |
