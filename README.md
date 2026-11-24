<div align="center">

# Software Design & Architecture: Labs in Java

Labs and assignments from the *Software Design & Architecture* course<br>
at COMSATS University Islamabad (Abbottabad Campus), 2025.

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![Topics](https://img.shields.io/badge/topics-GRASP%20%C2%B7%20patterns%20%C2%B7%20architecture-6f42c1)
![License](https://img.shields.io/badge/license-MIT-green)

</div>

---

## What's inside

| Topic | Where | What it shows |
| :-- | :-- | :-- |
| **GRASP: Creator** | [`CreatorPrincipleExample.java`](CreatorPrincipleExample.java) · [`NoCreatorExample.java`](NoCreatorExample.java) | The same book built two ways: through a `Book` class that owns its own construction, and as loose variables with no structure |
| **Decorator: shapes** | [`Decorator Lab/Tutorialpoint_Code/`](Decorator%20Lab/Tutorialpoint_Code) | A red-border decorator wraps any shape and adds to its price: a 10.0 circle becomes 15.0 |
| **Decorator: data pipeline** | [`Decorator Lab/decorator/filedecorators/`](Decorator%20Lab/decorator/filedecorators) | Compression, Base64 encoding and UTF-8 decorators stack around a file data source. One chain writes salary records to disk and reads them back |
| **Observer: kids monitoring** | [`MID_LAB_SDA/`](MID_LAB_SDA) | An IoT sensor alerts a guardian and an admin only on alarming activity (crying, fighting, loud noise). Task sheet in `MID_LAB.pdf` |
| **Observer: assignment** | [`OBSERVER_DESIGN_PATTERN-main/`](OBSERVER_DESIGN_PATTERN-main) | Copy of [OBSERVER_DESIGN_PATTERN](https://github.com/hammadfareed4/OBSERVER_DESIGN_PATTERN), with two video walkthroughs |
| **Pipe and Filter** | [`PipeAndFilter/`](PipeAndFilter) | A list of numbers flows through four filter functions in order, each one's output feeding the next (NetBeans project) |
| **Peer-to-Peer** | [`P2P Architecture/`](P2P%20Architecture) | Two-way terminal chat over sockets. Each peer listens on its own thread and sends on another, so neither blocks |

---

## Running the examples

You need JDK 17 or newer (tested on JDK 23). Run these from the repository root. Some folder names contain spaces, so keep the quotes.

```bash
# GRASP: Creator
javac -d out CreatorPrincipleExample.java && java -cp out CreatorPrincipleExample

# Decorator: shapes
javac -d out "Decorator Lab/Tutorialpoint_Code/"*.java && java -cp out DecoratorPatternDemo

# Decorator: data pipeline (writes OutputDemo.txt in the current folder)
javac -d out "Decorator Lab/decorator/filedecorators/"*.java && java -cp out decorator.filedecorators.Demo

# Observer: kids monitoring
javac -d out MID_LAB_SDA/*.java && java -cp out KidsMonitoringApp

# Pipe and Filter
javac -d out PipeAndFilter/src/pipeandfilter/PipeAndFilter.java && java -cp out pipeandfilter.PipeAndFilter
```

### Peer-to-peer chat

Open two terminals. Each peer takes `<local port> <remote port> <remote IP>`:

```bash
javac -d out "P2P Architecture/Peer1.java"
java -cp out Peer1 5001 5002 127.0.0.1   # terminal 1
java -cp out Peer1 5002 5001 127.0.0.1   # terminal 2
```

Type a message in either terminal and it shows up in the other. Type `exit` to leave. To chat across two machines on the same network, use the other machine's IP instead of `127.0.0.1`.

---

## Sample output

**Decorator: data pipeline.** The file on disk holds the compressed, encoded text. Reading through the same chain gives back the original:

```text
- Input ----------------
Name,Salary
John Smith,100000
Jane Doe,90000
- Encoded File ---------
SDRzSUFBQUFBQUFBLy9OTHpFM1ZDVTdNU1N5cTVQTEt6OGhUQ003TkxNblFNVFFBQVM2dnhMeFVCWmY4VkIxTEVCY0FHWS9EYkN3QUFBQT0=
- Decoded Output -------
Name,Salary
John Smith,100000
Jane Doe,90000
```

**Observer: kids monitoring.** "laughing" is not alarming, so nobody is notified:

```text
[Sensor at Room A] Detected: crying
[Guardian: Mother] Alert: CRYING detected in Room A
[Admin: System Admin] Notification: CRYING detected in Room A
[Sensor at Room A] Detected: laughing
[Sensor at Room A] Detected: fighting
[Guardian: Mother] Alert: FIGHTING detected in Room A
[Admin: System Admin] Notification: FIGHTING detected in Room A
```

---

## Why the Creator principle matters

| With a `Book` class | With loose variables |
| :-- | :-- |
| One place defines what a book is | Every book is a fresh set of variables |
| Every book is guaranteed a title and an author | Nothing stops a book missing a field |
| Change the format once, in `display()` | Change every `println` by hand |
| 100 books means 100 objects | 100 books means 200 variables |

---

## Credits

The shape decorator follows [TutorialsPoint's Decorator example](https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm), and the data-pipeline decorator follows [Refactoring.Guru's](https://refactoring.guru/design-patterns/decorator), both extended for the lab.

## License

[MIT](LICENSE) © 2025 Hammad Fareed
