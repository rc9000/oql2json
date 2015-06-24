# oql2json - ANTLR-generated Converter from Netcool ITNM OQL Inserts to JSON

[IBM Tivoli Network Manager (aka ITNM)](http://www-03.ibm.com/software/products/en/ibmtivolinetworkmanageripedition) 
is a network modelling software suite. It uses an internal **Object Query Language (OQL)** database with an SQL-like syntax that 
natively supports nested arrays and hashes as datatypes.

oql2json is mostly a [ANTLR grammar](https://github.com/rc9000/oql2json/blob/master/oql2json/grammar/ItnmDump.g4) 
that understands OQL insert statements, and then some lines of code to walk the parse tree and convert it to JSON.

# How to use 
 
     (shell) $ git clone https://github.com/rc9000/oql2json
     (shell) $ cd cd oql2json/oql2json
     (shell) $ mvn package
    
     (shell) $ cat examples/ex1.txt
    
    insert into master.entityByName
    (
    EntityName,
    BaseName,
    EntityType
    )
    values
    (
    "the entity name 1",
    "the basename",
    1
    );
    
    insert into master.entityByName
    (
    EntityName,
    BaseName,
    AnArray,
    SomeHash
    )
    values
    (
    "the entity name 2",
    "the basename",
    ['a', 'b'],
    {  key1=1,
       key2="foo",
       key3=['aa', 'bb']}
    );
    
     (shell) $ java -jar target/oql2json-SNAPSHOT-jar-with-dependencies.jar examples/ex1.txt
    [
      {
        "values": [
          "the entity name 1",
          "the basename",
          1
        ],
        "columns": [
          "EntityName",
          "BaseName",
          "EntityType"
        ]
      },
      {
        "values": [
          "the entity name 2",
          "the basename",
          [
            "a",
            "b"
          ],
          {
            "key1": 1,
            "key2": "foo",
            "key3": [
              "aa",
              "bb"
            ]
          }
        ],
        "columns": [
          "EntityName",
          "BaseName",
          "AnArray",
          "SomeHash"
        ]
      }
    ]

