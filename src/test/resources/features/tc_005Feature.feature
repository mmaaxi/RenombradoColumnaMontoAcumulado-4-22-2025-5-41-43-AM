Feature: Validación del renombrado de columna en reporte exportado

  Scenario: Validar renombrado de columna 'Monto Acumulado Folio OPC' a 'Monto Acumulado Folio OPC (2121)'
    Given el usuario exporta el reporte y abre el Excel
    When el usuario ubica la columna 'Monto Acumulado Folio OPC'
    Then se localiza la columna original
    When el usuario confirma que la columna ha sido renombrada a 'Monto Acumulado Folio OPC (2121)'
    Then el nombre de la columna se actualiza correctamente