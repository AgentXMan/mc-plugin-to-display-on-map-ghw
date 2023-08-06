https://youtu.be/mbTWgGMqxcw
https://devpost.com/software/data-plugin


# ghw-mc-plugin
this is a small Minecraft plugin (still in development) that I created to visualize your Samsung Health data on MC maps. This project was developed for Global Hack Week by mlh (Data Week) challenge on day 6 (build a data visualization).


# installation and running
Make sure you have installed numpy, pandas, PIL, and matplotlib. Ensure that all the files downloaded from this repository are placed in the same directory as in the repo.

Run visualizeDataMcPlugin.py (get your personal data from samsung health and chooose the daily steps count csv file). This will generate two files: stepCountTrend.png and resizedStepCountTrend.png. Both files contain the same data, but stepCountTrend.png is large enough to be easily readable, while resizedStepCountTrend.png is specifically designed for the MC plugin.

i assume you already have a Spigot server running for the MC plugin and have created a new Java 16 project using Maven in IntelliJ IDEA with Minecraft 1.20.1 installed.

Once the files are downloaded, navigate to the "mc-plugin/" folder, where you will find pom.xml. Edit line 52 to specify your desired output directory (place it in your MC server's plugins directory).

After that, go to "mc-plugin//src/main/java/me/agentxman/globalhackweekdataweek". Here you will find the Java files. Open mapRenderer.java and change the directory in line 25 to point to the location of your resizedStepCountTrend.png file. Then, run map.java and join your server.

In the Minecraft server, open the command prompt and type "/map" to view the map displaying your step count graph.



# caution
Please ensure that the steps count is correctly provided in the CSV file. To ensure this, download your personal data from Samsung Health, which will include the daily step count file. Insert that file and change the CSV file name if necessary.

If you encounter any errors while running the Java plugin, consider creating a new project with Java 16 and Maven, using Minecraft 1.20.1 (assuming you already have Spigot installed as mentioned above). Copy and paste the code, making sure to change the package name to match what you used while creating the project. Also, avoid copying and pasting the header file wherever "agentxman" is mentioned. Check the plugin.yml file and update it if necessary.



# still in dev
Note: This project is still in development, so apologies for any errors or bugs that may arise. the documentation will be updated as soon as i update this project
