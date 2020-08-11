# Scout Plugin Demo

## Build
Ensure the `Demo.java` file in in the plugin folder of Scout.
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

See [LICENSE](https://github.com/andreas-bauer/scout-plugin-demo/blob/master/LICENSE) file in the root of this project for license details.
