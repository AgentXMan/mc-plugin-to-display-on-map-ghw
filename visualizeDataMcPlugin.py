
import numpy as np
import pandas as pd
import csv
from PIL import Image

import matplotlib.pyplot as plt
import matplotlib.ticker as mtick
from datetime import date, time, datetime

df = pd.read_csv("steps.csv")
plt.style.use('ggplot')

def add3AvgCount(old, new, ind, val):
    df.insert(ind, new, val)
    for i in range(len(df)):
        if i == 0 or i == 1 or i == len(df) - 2 or i == len(df) - 1:
            df[new][i] = df[old][i]
        else:
            df[new][i] = (df[old][i] + df[old][i-1] + df[old][i+1] + df[old][i-2] + df[old][i-2])/5
    return


#done for making the plot a bit more average oriented
add3AvgCount("count", "avg", 5, 0)
add3AvgCount("avg", "doubbavg", 6, 0)
add3AvgCount("doubbavg", "tripavg", 7, 0)
add3AvgCount("tripavg", "quadavg", 8, 0)
add3AvgCount("quadavg", "quintavg", 9, 0)
add3AvgCount("quintavg", "sexavg", 10, 0)
add3AvgCount("sexavg", "septavg", 11, 0)
add3AvgCount("septavg", "octavg", 12, 0)
add3AvgCount("octavg", "nonavg", 13, 0)
add3AvgCount("nonavg", "decavg", 14, 0)
add3AvgCount("decavg", "undecavg", 15, 0)
add3AvgCount("undecavg", "doubavgx", 16, 0)
add3AvgCount("doubavgx", "tripavgx", 17, 0)
add3AvgCount("tripavgx", "x", 18, 0)

plug = "x"

#the colomns that we don't want 
toDrop = ["binning_data","update_time","create_time", "source_pkg_name", "source_type", "deviceuuid", "pkg_name", "datauuid"]

df.drop(columns=toDrop, inplace=True, axis=1)
# print(df.head)


plt.plot(df.index, df[plug])
plt.xlabel('Day Time')
plt.ylabel('Count')
plt.title('Step Count Trend')
plt.savefig('stepCountTrend.png')
plt.show()


image_path = 'stepCountTrend.png'
img = Image.open(image_path)
img = img.resize((128, 128))
img.save('resizedStepCountTrend.png')

