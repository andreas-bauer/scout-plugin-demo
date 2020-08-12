# Scout Plugin Demo

## Build
Ensure the `Demo.java` file is in the plugin folder of Scout.
Than build the Java file with the `javac` command.

`javac -cp "../Scout.jar" Demo.java`

## Reports
The demo plugin also generates a report with some information that was collected during a testing session.

See example: 

```json
{
  "product": "Traveler",
  "total-actions": {
    "LeftClickAction": 5,
    "DragStartAction": 1,
    "RightClickAction": 0,
    "DragDropAction": 1
  },
  "issues": [
      "Wrong title text",
      "Wrong button text"
  ]
}
```

## License

Copyright (c) 2020 Andreas Bauer

This work (source code) is licensed under [MIT](./LICENSES/MIT.txt).

Files other than source code are licensed as follows:
- Documentation and screenshots are licensed under [CC BY-SA 4.0](./LICENSES/CC-BY-SA-4.0.txt).

See the [LICENSES](./LICENSES/) folder in the root of this project for license details.