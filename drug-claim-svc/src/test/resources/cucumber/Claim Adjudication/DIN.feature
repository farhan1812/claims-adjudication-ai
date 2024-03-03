Feature: DIN

  @unit
  Scenario: Unknown DIN

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN | Provider |
          |     100.0 |       10.0 |         80.0 | 1234 | 12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          |    Unknown DIN |

  @unit
  Scenario: Known DIN with different cost

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |   Provider |
          |     100.0 |       10.0 |         80.0 | 2345 |   12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          | Different Cost |

  @unit @component
  Scenario: Known DIN with same cost

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN | Provider |
          |     100.0 |       10.0 |         80.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          |    No Problems |

