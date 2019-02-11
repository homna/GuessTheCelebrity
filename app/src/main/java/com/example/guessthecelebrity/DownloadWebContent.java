package com.example.guessthecelebrity;

import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadWebContent extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... urls) {
        StringBuilder output = new StringBuilder();
        try {
            URL url = new URL(urls[0]);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int read = inputStreamReader.read();
            while (read != -1) {
                char character = (char) read;
                output.append(character);
                read = inputStreamReader.read();
            }
            return "<tbody id=\"list-table-body\">\n" +
                    "\t\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/floyd-mayweather/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b149bb84bbe6f74868b761f/200x200.jpg?background=000000&amp;cropX1=268&amp;cropX2=2355&amp;cropY1=234&amp;cropY2=2323\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#1 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/floyd-mayweather/?list=celebrities\" class=\"exit_trigger_set\">Floyd Mayweather</a></td>\n" +
                    "\t\t\t\t\t<td>41</td>\n" +
                    "\t\t\t\t\t<td>$285 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/george-clooney/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43ae4b31358e2c990e9203/200x200.jpg?background=000000&amp;cropX1=403&amp;cropX2=2584&amp;cropY1=60&amp;cropY2=2242\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#2 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/george-clooney/?list=celebrities\" class=\"exit_trigger_set\">George Clooney</a></td>\n" +
                    "\t\t\t\t\t<td>57</td>\n" +
                    "\t\t\t\t\t<td>$239 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kylie-jenner/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43c2144bbe6f1becf1c36d/200x200.jpg?background=000000&amp;cropX1=453&amp;cropX2=3521&amp;cropY1=215&amp;cropY2=3285\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#3 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kylie-jenner/?list=celebrities\" class=\"exit_trigger_set\">Kylie Jenner</a></td>\n" +
                    "\t\t\t\t\t<td>21</td>\n" +
                    "\t\t\t\t\t<td>$166.5 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/judy-sheindlin/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/58ff85ea4bbe6f1aff4644a0/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=2400&amp;cropY1=90&amp;cropY2=2490\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#4 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/judy-sheindlin/?list=celebrities\" class=\"exit_trigger_set\">Judy Sheindlin</a></td>\n" +
                    "\t\t\t\t\t<td>76</td>\n" +
                    "\t\t\t\t\t<td>$147 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/dwayne-johnson/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43a9a84bbe6f1becf1bdb5/200x200.jpg?background=000000&amp;cropX1=894&amp;cropX2=3640&amp;cropY1=107&amp;cropY2=2853\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#5 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/dwayne-johnson/?list=celebrities\" class=\"exit_trigger_set\">Dwayne Johnson</a></td>\n" +
                    "\t\t\t\t\t<td>46</td>\n" +
                    "\t\t\t\t\t<td>$124 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/u2/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b45009531358e2c990eaf7d/200x200.jpg?background=000000&amp;cropX1=762&amp;cropX2=3499&amp;cropY1=0&amp;cropY2=2735\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#6 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/u2/?list=celebrities\" class=\"exit_trigger_set\">U2</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$118 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/coldplay/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43913e31358e2c990e8ecb/200x200.jpg?background=000000&amp;cropX1=1211&amp;cropX2=3268&amp;cropY1=423&amp;cropY2=2479\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#7 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/coldplay/?list=celebrities\" class=\"exit_trigger_set\">Coldplay</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$115.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/lionel-messi/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1559ba31358e612fbb121f/200x200.jpg?background=000000&amp;cropX1=193&amp;cropX2=3062&amp;cropY1=207&amp;cropY2=3078\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#8 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/lionel-messi/?list=celebrities\" class=\"exit_trigger_set\">Lionel Messi</a></td>\n" +
                    "\t\t\t\t\t<td>31</td>\n" +
                    "\t\t\t\t\t<td>$111 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/ed-sheeran/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43aa4c4bbe6f1becf1bdc9/200x200.jpg?background=000000&amp;cropX1=495&amp;cropX2=3226&amp;cropY1=133&amp;cropY2=2866\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#9 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/ed-sheeran/?list=celebrities\" class=\"exit_trigger_set\">Ed Sheeran</a></td>\n" +
                    "\t\t\t\t\t<td>27</td>\n" +
                    "\t\t\t\t\t<td>$110 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/cristiano-ronaldo/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/200x200.jpg?background=000000&amp;cropX1=451&amp;cropX2=2982&amp;cropY1=143&amp;cropY2=2675\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#10 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/cristiano-ronaldo/?list=celebrities\" class=\"exit_trigger_set\">Cristiano Ronaldo</a></td>\n" +
                    "\t\t\t\t\t<td>34</td>\n" +
                    "\t\t\t\t\t<td>$108 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_1\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/bruno-mars/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b438dada7ea4341970e0788/200x200.jpg?background=000000&amp;cropX1=724&amp;cropX2=2241&amp;cropY1=86&amp;cropY2=1603\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#11 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/bruno-mars/?list=celebrities\" class=\"exit_trigger_set\">Bruno Mars</a></td>\n" +
                    "\t\t\t\t\t<td>33</td>\n" +
                    "\t\t\t\t\t<td>$100 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/conor-mcgregor/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b147f2a4bbe6f74868b7498/200x200.jpg?background=000000&amp;cropX1=782&amp;cropX2=2151&amp;cropY1=43&amp;cropY2=1411\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#12 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/conor-mcgregor/?list=celebrities\" class=\"exit_trigger_set\">Conor McGregor</a></td>\n" +
                    "\t\t\t\t\t<td>30</td>\n" +
                    "\t\t\t\t\t<td>$99 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/neymar/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b15600c4bbe6f74868b853b/200x200.jpg?background=000000&amp;cropX1=823&amp;cropX2=2764&amp;cropY1=56&amp;cropY2=1997\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#13 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/neymar/?list=celebrities\" class=\"exit_trigger_set\">Neymar</a></td>\n" +
                    "\t\t\t\t\t<td>27</td>\n" +
                    "\t\t\t\t\t<td>$90 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/howard-stern/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43afed31358e2c990e92a2/200x200.jpg?background=000000&amp;cropX1=1440&amp;cropX2=2890&amp;cropY1=139&amp;cropY2=1588\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#13 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/howard-stern/?list=celebrities\" class=\"exit_trigger_set\">Howard Stern</a></td>\n" +
                    "\t\t\t\t\t<td>65</td>\n" +
                    "\t\t\t\t\t<td>$90 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/ellen-degeneres/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43aae04bbe6f1becf1bde4/200x200.jpg?background=000000&amp;cropX1=790&amp;cropX2=2793&amp;cropY1=1014&amp;cropY2=3015\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#15 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/ellen-degeneres/?list=celebrities\" class=\"exit_trigger_set\">Ellen DeGeneres</a></td>\n" +
                    "\t\t\t\t\t<td>61</td>\n" +
                    "\t\t\t\t\t<td>$87.5 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/james-patterson/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43b9e4a7ea4341970e0eb3/200x200.jpg?background=000000&amp;cropX1=833&amp;cropX2=3666&amp;cropY1=0&amp;cropY2=2832\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#16 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/james-patterson/?list=celebrities\" class=\"exit_trigger_set\">James Patterson</a></td>\n" +
                    "\t\t\t\t\t<td>71</td>\n" +
                    "\t\t\t\t\t<td>$86 M</td>\n" +
                    "\t\t\t\t\t<td>Authors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/lebron-james/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b155801a7ea436b547f512c/200x200.jpg?background=000000&amp;cropX1=940&amp;cropX2=4019&amp;cropY1=74&amp;cropY2=3151\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#17 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/lebron-james/?list=celebrities\" class=\"exit_trigger_set\">LeBron James</a></td>\n" +
                    "\t\t\t\t\t<td>34</td>\n" +
                    "\t\t\t\t\t<td>$85.5 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/rush-limbaugh/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/25257ad75d020b67e97b04f9e952fd16/200x200.jpg?background=000000&amp;cropX1=58&amp;cropX2=665&amp;cropY1=13&amp;cropY2=621\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#18 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/rush-limbaugh/?list=celebrities\" class=\"exit_trigger_set\">Rush Limbaugh</a></td>\n" +
                    "\t\t\t\t\t<td>68</td>\n" +
                    "\t\t\t\t\t<td>$84.5 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/katy-perry/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43bc9131358e2c990e94a8/200x200.jpg?background=000000&amp;cropX1=411&amp;cropX2=1632&amp;cropY1=223&amp;cropY2=1444\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#19 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/katy-perry/?list=celebrities\" class=\"exit_trigger_set\">Katy Perry</a></td>\n" +
                    "\t\t\t\t\t<td>34</td>\n" +
                    "\t\t\t\t\t<td>$83 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/robert-downey-jr/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f42f31358e2c990eadbe/200x200.jpg?background=000000&amp;cropX1=527&amp;cropX2=2481&amp;cropY1=73&amp;cropY2=2027\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#20 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/robert-downey-jr/?list=celebrities\" class=\"exit_trigger_set\">Robert Downey Jr.</a></td>\n" +
                    "\t\t\t\t\t<td>53</td>\n" +
                    "\t\t\t\t\t<td>$81 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_2\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/taylor-swift/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44ff71a7ea4341970e2863/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=2832&amp;cropY1=81&amp;cropY2=2914\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#21 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/taylor-swift/?list=celebrities\" class=\"exit_trigger_set\">Taylor Swift</a></td>\n" +
                    "\t\t\t\t\t<td>29</td>\n" +
                    "\t\t\t\t\t<td>$80 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/dr-phil-mcgraw/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b4394a24bbe6f1becf1bad1/200x200.jpg?background=000000&amp;cropX1=917&amp;cropX2=2370&amp;cropY1=223&amp;cropY2=1676\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#22 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/dr-phil-mcgraw/?list=celebrities\" class=\"exit_trigger_set\">Dr. Phil McGraw</a></td>\n" +
                    "\t\t\t\t\t<td>68</td>\n" +
                    "\t\t\t\t\t<td>$77.5 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/roger-federer/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b156893a7ea436b547f54f2/200x200.jpg?background=000000&amp;cropX1=1691&amp;cropX2=2364&amp;cropY1=1265&amp;cropY2=1938\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#23 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/roger-federer/?list=celebrities\" class=\"exit_trigger_set\">Roger Federer</a></td>\n" +
                    "\t\t\t\t\t<td>37</td>\n" +
                    "\t\t\t\t\t<td>$77.2 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/stephen-curry/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b156e3831358e612fbb15f7/200x200.jpg?background=000000&amp;cropX1=334&amp;cropX2=2335&amp;cropY1=0&amp;cropY2=2000\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#24 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/stephen-curry/?list=celebrities\" class=\"exit_trigger_set\">Stephen Curry</a></td>\n" +
                    "\t\t\t\t\t<td>30</td>\n" +
                    "\t\t\t\t\t<td>$76.9 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jay-z/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/593b24534bbe6f1b730b6924/200x200.jpg?background=000000&amp;cropX1=557&amp;cropX2=2430&amp;cropY1=107&amp;cropY2=1979\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#25 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jay-z/?list=celebrities\" class=\"exit_trigger_set\">Jay-Z</a></td>\n" +
                    "\t\t\t\t\t<td>49</td>\n" +
                    "\t\t\t\t\t<td>$76.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/ryan-seacrest/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44fa324bbe6f1becf1e07c/200x200.jpg?background=000000&amp;cropX1=565&amp;cropX2=1678&amp;cropY1=94&amp;cropY2=1208\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#26 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/ryan-seacrest/?list=celebrities\" class=\"exit_trigger_set\">Ryan Seacrest</a></td>\n" +
                    "\t\t\t\t\t<td>44</td>\n" +
                    "\t\t\t\t\t<td>$74 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/guns-n-roses/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43af754bbe6f1becf1bef5/200x200.jpg?background=000000&amp;cropX1=332&amp;cropX2=2201&amp;cropY1=0&amp;cropY2=1867\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#27 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/guns-n-roses/?list=celebrities\" class=\"exit_trigger_set\">Guns N' Roses</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$71 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/roger-waters/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f521a7ea4341970e274f/200x200.jpg?background=000000&amp;cropX1=347&amp;cropX2=2344&amp;cropY1=0&amp;cropY2=1996\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#28 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/roger-waters/?list=celebrities\" class=\"exit_trigger_set\">Roger Waters</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$68 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/matt-ryan/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b155c0ea7ea436b547f5284/200x200.jpg?background=000000&amp;cropX1=193&amp;cropX2=3489&amp;cropY1=163&amp;cropY2=3456\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#29 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/matt-ryan/?list=celebrities\" class=\"exit_trigger_set\">Matt Ryan</a></td>\n" +
                    "\t\t\t\t\t<td>33</td>\n" +
                    "\t\t\t\t\t<td>$67.3 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kim-kardashian-west/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43c08f4bbe6f1becf1c2ad/200x200.jpg?background=000000&amp;cropX1=318&amp;cropX2=1571&amp;cropY1=470&amp;cropY2=1723\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#30 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kim-kardashian-west/?list=celebrities\" class=\"exit_trigger_set\">Kim Kardashian West</a></td>\n" +
                    "\t\t\t\t\t<td>38</td>\n" +
                    "\t\t\t\t\t<td>$67 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_3\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/chris-hemsworth/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b439080a7ea4341970e07f6/200x200.jpg?background=000000&amp;cropX1=964&amp;cropX2=4224&amp;cropY1=0&amp;cropY2=3258\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#31 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/chris-hemsworth/?list=celebrities\" class=\"exit_trigger_set\">Chris Hemsworth</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$64.5 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/sean-combs/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44fcab4bbe6f1becf1e0d2/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=1993&amp;cropY1=184&amp;cropY2=2177\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#32 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/sean-combs/?list=celebrities\" class=\"exit_trigger_set\">Sean Combs</a></td>\n" +
                    "\t\t\t\t\t<td>49</td>\n" +
                    "\t\t\t\t\t<td>$64 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/david-copperfield/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b439267a7ea4341970e082b/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=1996&amp;cropY1=47&amp;cropY2=2044\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#33 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/david-copperfield/?list=celebrities\" class=\"exit_trigger_set\">David Copperfield</a></td>\n" +
                    "\t\t\t\t\t<td>62</td>\n" +
                    "\t\t\t\t\t<td>$62 M</td>\n" +
                    "\t\t\t\t\t<td>Magicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/gordon-ramsay/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43aecba7ea4341970e0c2d/200x200.jpg?background=000000&amp;cropX1=629&amp;cropX2=2468&amp;cropY1=217&amp;cropY2=2057\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#33 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/gordon-ramsay/?list=celebrities\" class=\"exit_trigger_set\">Gordon Ramsay</a></td>\n" +
                    "\t\t\t\t\t<td>52</td>\n" +
                    "\t\t\t\t\t<td>$62 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/beyonce-knowles/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/59f4e6c24bbe6f37dda1445b/200x200.jpg?background=000000&amp;cropX1=81&amp;cropX2=1997&amp;cropY1=133&amp;cropY2=2049\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#35 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/beyonce-knowles/?list=celebrities\" class=\"exit_trigger_set\">Beyoncé Knowles</a></td>\n" +
                    "\t\t\t\t\t<td>37</td>\n" +
                    "\t\t\t\t\t<td>$60 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/matthew-stafford/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b155d5331358e612fbb1382/200x200.jpg?background=000000&amp;cropX1=790&amp;cropX2=3807&amp;cropY1=148&amp;cropY2=3163\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#36 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/matthew-stafford/?list=celebrities\" class=\"exit_trigger_set\">Matthew Stafford</a></td>\n" +
                    "\t\t\t\t\t<td>31</td>\n" +
                    "\t\t\t\t\t<td>$59.5 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kendrick-lamar/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43bd3aa7ea4341970e0f71/200x200.jpg?background=000000&amp;cropX1=364&amp;cropX2=1704&amp;cropY1=111&amp;cropY2=1452\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#37 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kendrick-lamar/?list=celebrities\" class=\"exit_trigger_set\">Kendrick Lamar</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$58 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jerry-seinfeld/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43bb6731358e2c990e9486/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=2400&amp;cropY1=174&amp;cropY2=2574\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#38 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jerry-seinfeld/?list=celebrities\" class=\"exit_trigger_set\">Jerry Seinfeld</a></td>\n" +
                    "\t\t\t\t\t<td>64</td>\n" +
                    "\t\t\t\t\t<td>$57.5 M</td>\n" +
                    "\t\t\t\t\t<td>Comedians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kevin-hart/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43be77a7ea4341970e0fab/200x200.jpg?background=000000&amp;cropX1=450&amp;cropX2=1667&amp;cropY1=210&amp;cropY2=1427\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#39 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kevin-hart/?list=celebrities\" class=\"exit_trigger_set\">Kevin Hart</a></td>\n" +
                    "\t\t\t\t\t<td>39</td>\n" +
                    "\t\t\t\t\t<td>$57 M</td>\n" +
                    "\t\t\t\t\t<td>Comedians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/the-weeknd/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b450025a7ea4341970e2888/200x200.jpg?background=000000&amp;cropX1=380&amp;cropX2=1532&amp;cropY1=386&amp;cropY2=1538\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#39 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/the-weeknd/?list=celebrities\" class=\"exit_trigger_set\">The Weeknd</a></td>\n" +
                    "\t\t\t\t\t<td>28</td>\n" +
                    "\t\t\t\t\t<td>$57 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_4\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/the-eagles/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//i.forbesimg.com/media/lists/people/the-eagles_100x100.jpg\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#41 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/the-eagles/?list=celebrities\" class=\"exit_trigger_set\">The Eagles</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$56 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jk-rowling/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43b8574bbe6f1becf1c11f/200x200.jpg?background=000000&amp;cropX1=525&amp;cropX2=2275&amp;cropY1=80&amp;cropY2=1830\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#42 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jk-rowling/?list=celebrities\" class=\"exit_trigger_set\">J.K. Rowling</a></td>\n" +
                    "\t\t\t\t\t<td>53</td>\n" +
                    "\t\t\t\t\t<td>$54 M</td>\n" +
                    "\t\t\t\t\t<td>Authors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kevin-durant/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1547204bbe6f74868b7e64/200x200.jpg?background=000000&amp;cropX1=1260&amp;cropX2=3735&amp;cropY1=504&amp;cropY2=2979\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#43 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kevin-durant/?list=celebrities\" class=\"exit_trigger_set\">Kevin Durant</a></td>\n" +
                    "\t\t\t\t\t<td>30</td>\n" +
                    "\t\t\t\t\t<td>$53.7 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/depeche-mode/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b4392e831358e2c990e8f02/200x200.jpg?background=000000&amp;cropX1=159&amp;cropX2=2151&amp;cropY1=283&amp;cropY2=2276\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#44 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/depeche-mode/?list=celebrities\" class=\"exit_trigger_set\">Depeche Mode</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$53 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/luke-bryan/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43c3144bbe6f1becf1c3c8/200x200.jpg?background=000000&amp;cropX1=501&amp;cropX2=2020&amp;cropY1=57&amp;cropY2=1577\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#45 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/luke-bryan/?list=celebrities\" class=\"exit_trigger_set\">Luke Bryan</a></td>\n" +
                    "\t\t\t\t\t<td>42</td>\n" +
                    "\t\t\t\t\t<td>$52 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/pink/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f2a7a7ea4341970e2706/200x200.jpg?background=000000&amp;cropX1=667&amp;cropX2=3613&amp;cropY1=46&amp;cropY2=2991\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#45 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/pink/?list=celebrities\" class=\"exit_trigger_set\">Pink</a></td>\n" +
                    "\t\t\t\t\t<td>39</td>\n" +
                    "\t\t\t\t\t<td>$52 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jimmy-buffett/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43bc0f4bbe6f1becf1c1af/200x200.jpg?background=000000&amp;cropX1=750&amp;cropX2=2709&amp;cropY1=43&amp;cropY2=2000\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#47 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jimmy-buffett/?list=celebrities\" class=\"exit_trigger_set\">Jimmy Buffett</a></td>\n" +
                    "\t\t\t\t\t<td>72</td>\n" +
                    "\t\t\t\t\t<td>$51 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/lewis-hamilton/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1559054bbe6f74868b8385/200x200.jpg?background=000000&amp;cropX1=1114&amp;cropX2=3921&amp;cropY1=307&amp;cropY2=3112\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#47 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/lewis-hamilton/?list=celebrities\" class=\"exit_trigger_set\">Lewis Hamilton</a></td>\n" +
                    "\t\t\t\t\t<td>34</td>\n" +
                    "\t\t\t\t\t<td>$51 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/lady-gaga-1/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43c2b04bbe6f1becf1c38a/200x200.jpg?background=000000&amp;cropX1=490&amp;cropX2=2830&amp;cropY1=80&amp;cropY2=2420\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#49 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/lady-gaga-1/?list=celebrities\" class=\"exit_trigger_set\">Lady Gaga</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$50 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/calvin-harris/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b438e2031358e2c990e8e4c/200x200.jpg?background=000000&amp;cropX1=43&amp;cropX2=2131&amp;cropY1=176&amp;cropY2=2263\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#50 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/calvin-harris/?list=celebrities\" class=\"exit_trigger_set\">Calvin Harris</a></td>\n" +
                    "\t\t\t\t\t<td>35</td>\n" +
                    "\t\t\t\t\t<td>$48 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_5\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/paul-mccartney/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f1dea7ea4341970e26d8/200x200.jpg?background=000000&amp;cropX1=515&amp;cropX2=2228&amp;cropY1=34&amp;cropY2=1746\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#51 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/paul-mccartney/?list=celebrities\" class=\"exit_trigger_set\">Paul McCartney</a></td>\n" +
                    "\t\t\t\t\t<td>76</td>\n" +
                    "\t\t\t\t\t<td>$47.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/russell-westbrook/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1569df4bbe6f74868b86a0/200x200.jpg?background=000000&amp;cropX1=77&amp;cropX2=1907&amp;cropY1=171&amp;cropY2=2001\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#51 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/russell-westbrook/?list=celebrities\" class=\"exit_trigger_set\">Russell Westbrook</a></td>\n" +
                    "\t\t\t\t\t<td>30</td>\n" +
                    "\t\t\t\t\t<td>$47.5 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/drake/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43a794a7ea4341970e0a91/200x200.jpg?background=000000&amp;cropX1=1020&amp;cropX2=1899&amp;cropY1=291&amp;cropY2=1169\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#53 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/drake/?list=celebrities\" class=\"exit_trigger_set\">Drake</a></td>\n" +
                    "\t\t\t\t\t<td>32</td>\n" +
                    "\t\t\t\t\t<td>$47 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/foo-fighters/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43ac63a7ea4341970e0b38/200x200.jpg?background=000000&amp;cropX1=845&amp;cropX2=3719&amp;cropY1=115&amp;cropY2=2987\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#53 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/foo-fighters/?list=celebrities\" class=\"exit_trigger_set\">Foo Fighters</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$47 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jennifer-lopez/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43baeca7ea4341970e0eca/200x200.jpg?background=000000&amp;cropX1=302&amp;cropX2=2965&amp;cropY1=19&amp;cropY2=2682\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#53 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jennifer-lopez/?list=celebrities\" class=\"exit_trigger_set\">Jennifer Lopez</a></td>\n" +
                    "\t\t\t\t\t<td>49</td>\n" +
                    "\t\t\t\t\t<td>$47 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/james-harden/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b153a1031358e612fbb0afb/200x200.jpg?background=000000&amp;cropX1=642&amp;cropX2=2255&amp;cropY1=29&amp;cropY2=1641\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#56 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/james-harden/?list=celebrities\" class=\"exit_trigger_set\">James Harden</a></td>\n" +
                    "\t\t\t\t\t<td>29</td>\n" +
                    "\t\t\t\t\t<td>$46.4 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/elton-john/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43ab9731358e2c990e91a5/200x200.jpg?background=000000&amp;cropX1=903&amp;cropX2=3933&amp;cropY1=0&amp;cropY2=3032\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#57 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/elton-john/?list=celebrities\" class=\"exit_trigger_set\">Elton John</a></td>\n" +
                    "\t\t\t\t\t<td>71</td>\n" +
                    "\t\t\t\t\t<td>$46 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/metallica/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f0d2a7ea4341970e269b/200x200.jpg?background=000000&amp;cropX1=882&amp;cropX2=3337&amp;cropY1=328&amp;cropY2=2781\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#57 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/metallica/?list=celebrities\" class=\"exit_trigger_set\">Metallica</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$46 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/garth-brooks/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43ad15a7ea4341970e0b6b/200x200.jpg?background=000000&amp;cropX1=540&amp;cropX2=2627&amp;cropY1=26&amp;cropY2=2112\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#59 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/garth-brooks/?list=celebrities\" class=\"exit_trigger_set\">Garth Brooks</a></td>\n" +
                    "\t\t\t\t\t<td>57</td>\n" +
                    "\t\t\t\t\t<td>$45.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jackie-chan/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43b92da7ea4341970e0e84/200x200.jpg?background=000000&amp;cropX1=180&amp;cropX2=5533&amp;cropY1=17&amp;cropY2=5374\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#59 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jackie-chan/?list=celebrities\" class=\"exit_trigger_set\">Jackie Chan</a></td>\n" +
                    "\t\t\t\t\t<td>64</td>\n" +
                    "\t\t\t\t\t<td>$45.5 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_6\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/the-chainsmokers/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b438f3d4bbe6f1becf1ba2f/200x200.jpg?background=000000&amp;cropX1=470&amp;cropX2=1810&amp;cropY1=113&amp;cropY2=1452\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#59 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/the-chainsmokers/?list=celebrities\" class=\"exit_trigger_set\">The Chainsmokers</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$45.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/canelo-alvarez/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b147c3d4bbe6f74868b747c/200x200.jpg?background=000000&amp;cropX1=1318&amp;cropX2=3259&amp;cropY1=77&amp;cropY2=2020\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#62 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/canelo-alvarez/?list=celebrities\" class=\"exit_trigger_set\">Canelo Alvarez</a></td>\n" +
                    "\t\t\t\t\t<td>28</td>\n" +
                    "\t\t\t\t\t<td>$44.5 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/steve-harvey/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44feffa7ea4341970e2850/200x200.jpg?background=000000&amp;cropX1=418&amp;cropX2=2110&amp;cropY1=232&amp;cropY2=1924\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#63 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/steve-harvey/?list=celebrities\" class=\"exit_trigger_set\">Steve Harvey</a></td>\n" +
                    "\t\t\t\t\t<td>62</td>\n" +
                    "\t\t\t\t\t<td>$44 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/simon-cowell/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44fd9f31358e2c990eaf19/200x200.jpg?background=000000&amp;cropX1=450&amp;cropX2=2301&amp;cropY1=86&amp;cropY2=1937\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#64 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/simon-cowell/?list=celebrities\" class=\"exit_trigger_set\">Simon Cowell</a></td>\n" +
                    "\t\t\t\t\t<td>59</td>\n" +
                    "\t\t\t\t\t<td>$43.5 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/billy-joel/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b4386b431358e2c990e8d36/200x200.jpg?background=000000&amp;cropX1=1144&amp;cropX2=2288&amp;cropY1=300&amp;cropY2=1444\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#64 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/billy-joel/?list=celebrities\" class=\"exit_trigger_set\">Billy Joel</a></td>\n" +
                    "\t\t\t\t\t<td>69</td>\n" +
                    "\t\t\t\t\t<td>$43.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/tiger-woods/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b15712231358e612fbb1673/200x200.jpg?background=000000&amp;cropX1=1501&amp;cropX2=3937&amp;cropY1=133&amp;cropY2=2567\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#66 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/tiger-woods/?list=celebrities\" class=\"exit_trigger_set\">Tiger Woods</a></td>\n" +
                    "\t\t\t\t\t<td>43</td>\n" +
                    "\t\t\t\t\t<td>$43.3 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/drew-brees/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43a840a7ea4341970e0aa4/200x200.jpg?background=000000&amp;cropX1=83&amp;cropX2=1390&amp;cropY1=32&amp;cropY2=1340\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#67 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/drew-brees/?list=celebrities\" class=\"exit_trigger_set\">Drew Brees</a></td>\n" +
                    "\t\t\t\t\t<td>40</td>\n" +
                    "\t\t\t\t\t<td>$42.9 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/sofia-vergara/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44fe124bbe6f1becf1e136/200x200.jpg?background=000000&amp;cropX1=705&amp;cropX2=2999&amp;cropY1=108&amp;cropY2=2400\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#68 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/sofia-vergara/?list=celebrities\" class=\"exit_trigger_set\">Sofía Vergara</a></td>\n" +
                    "\t\t\t\t\t<td>46</td>\n" +
                    "\t\t\t\t\t<td>$42.5 M</td>\n" +
                    "\t\t\t\t\t<td>Television actresses</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/sebastian-vettel/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b156d9431358e612fbb15db/200x200.jpg?background=000000&amp;cropX1=525&amp;cropX2=3597&amp;cropY1=0&amp;cropY2=3072\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#69 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/sebastian-vettel/?list=celebrities\" class=\"exit_trigger_set\">Sebastian Vettel</a></td>\n" +
                    "\t\t\t\t\t<td>31</td>\n" +
                    "\t\t\t\t\t<td>$42.3 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/derek-carr/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b149a92a7ea436b547f4546/200x200.jpg?background=000000&amp;cropX1=499&amp;cropX2=3048&amp;cropY1=0&amp;cropY2=2547\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#70 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/derek-carr/?list=celebrities\" class=\"exit_trigger_set\">Derek Carr</a></td>\n" +
                    "\t\t\t\t\t<td>27</td>\n" +
                    "\t\t\t\t\t<td>$42.1 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_7\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/will-smith/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b4501254bbe6f1becf1e1a5/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=2995&amp;cropY1=58&amp;cropY2=3055\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#71 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/will-smith/?list=celebrities\" class=\"exit_trigger_set\">Will Smith</a></td>\n" +
                    "\t\t\t\t\t<td>50</td>\n" +
                    "\t\t\t\t\t<td>$42 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/rafael-nadal/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1567d6a7ea436b547f54ce/200x200.jpg?background=000000&amp;cropX1=1174&amp;cropX2=2630&amp;cropY1=589&amp;cropY2=2045\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#72 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/rafael-nadal/?list=celebrities\" class=\"exit_trigger_set\">Rafael Nadal</a></td>\n" +
                    "\t\t\t\t\t<td>32</td>\n" +
                    "\t\t\t\t\t<td>$41.4 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/alex-smith/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1476f9a7ea436b547f434d/200x200.jpg?background=000000&amp;cropX1=1126&amp;cropX2=4451&amp;cropY1=139&amp;cropY2=3463\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#72 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/alex-smith/?list=celebrities\" class=\"exit_trigger_set\">Alex Smith</a></td>\n" +
                    "\t\t\t\t\t<td>34</td>\n" +
                    "\t\t\t\t\t<td>$41.4 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/phil-mickelson/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1566af31358e612fbb153d/200x200.jpg?background=000000&amp;cropX1=893&amp;cropX2=3803&amp;cropY1=172&amp;cropY2=3081\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#74 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/phil-mickelson/?list=celebrities\" class=\"exit_trigger_set\">Phil Mickelson</a></td>\n" +
                    "\t\t\t\t\t<td>48</td>\n" +
                    "\t\t\t\t\t<td>$41.3 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jordan-spieth/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b153cbd4bbe6f74868b7d10/200x200.jpg?background=000000&amp;cropX1=1430&amp;cropX2=4145&amp;cropY1=101&amp;cropY2=2815\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#75 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jordan-spieth/?list=celebrities\" class=\"exit_trigger_set\">Jordan Spieth</a></td>\n" +
                    "\t\t\t\t\t<td>25</td>\n" +
                    "\t\t\t\t\t<td>$41.2 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/scarlett-johansson/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44fc1ea7ea4341970e27fd/200x200.jpg?background=000000&amp;cropX1=1516&amp;cropX2=4451&amp;cropY1=156&amp;cropY2=3092\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#76 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/scarlett-johansson/?list=celebrities\" class=\"exit_trigger_set\">Scarlett Johansson</a></td>\n" +
                    "\t\t\t\t\t<td>34</td>\n" +
                    "\t\t\t\t\t<td>$40.5 M</td>\n" +
                    "\t\t\t\t\t<td>Actresses</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/akshay-kumar/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43838331358e2c990e8c73/200x200.jpg?background=000000&amp;cropX1=1339&amp;cropX2=2803&amp;cropY1=569&amp;cropY2=2034\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#76 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/akshay-kumar/?list=celebrities\" class=\"exit_trigger_set\">Akshay Kumar</a></td>\n" +
                    "\t\t\t\t\t<td>51</td>\n" +
                    "\t\t\t\t\t<td>$40.5 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/adam-sandler/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43826f4bbe6f1becf1b7c9/200x200.jpg?background=000000&amp;cropX1=99&amp;cropX2=2148&amp;cropY1=13&amp;cropY2=2062\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#78 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/adam-sandler/?list=celebrities\" class=\"exit_trigger_set\">Adam Sandler</a></td>\n" +
                    "\t\t\t\t\t<td>52</td>\n" +
                    "\t\t\t\t\t<td>$39.5 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/damian-lillard/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b14816e4bbe6f74868b74d4/200x200.jpg?background=000000&amp;cropX1=531&amp;cropX2=1340&amp;cropY1=343&amp;cropY2=1153\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#79 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/damian-lillard/?list=celebrities\" class=\"exit_trigger_set\">Damian Lillard</a></td>\n" +
                    "\t\t\t\t\t<td>28</td>\n" +
                    "\t\t\t\t\t<td>$39.2 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/anthony-joshua-1/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b0f19a1a7ea436b547ed2c5/200x200.jpg?background=000000&amp;cropX1=514&amp;cropX2=2524&amp;cropY1=13&amp;cropY2=2021\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#80 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/anthony-joshua-1/?list=celebrities\" class=\"exit_trigger_set\">Anthony Joshua</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$39 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_8\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/rolling-stones/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f5dc31358e2c990eaded/200x200.jpg?background=000000&amp;cropX1=274&amp;cropX2=2498&amp;cropY1=0&amp;cropY2=2225\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#80 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/rolling-stones/?list=celebrities\" class=\"exit_trigger_set\">Rolling Stones</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$39 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/salman-khan/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44faf831358e2c990eaeb9/200x200.jpg?background=000000&amp;cropX1=1267&amp;cropX2=2952&amp;cropY1=560&amp;cropY2=2246\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#82 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/salman-khan/?list=celebrities\" class=\"exit_trigger_set\">Salman Khan</a></td>\n" +
                    "\t\t\t\t\t<td>53</td>\n" +
                    "\t\t\t\t\t<td>$37.7 M</td>\n" +
                    "\t\t\t\t\t<td>Actors</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/rory-mcilroy/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b156944a7ea436b547f54ff/200x200.jpg?background=000000&amp;cropX1=557&amp;cropX2=2378&amp;cropY1=99&amp;cropY2=1922\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#82 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/rory-mcilroy/?list=celebrities\" class=\"exit_trigger_set\">Rory McIlroy</a></td>\n" +
                    "\t\t\t\t\t<td>29</td>\n" +
                    "\t\t\t\t\t<td>$37.7 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kris-jenner/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43c1944bbe6f1becf1c338/200x200.jpg?background=000000&amp;cropX1=1668&amp;cropX2=3402&amp;cropY1=111&amp;cropY2=1844\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#84 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kris-jenner/?list=celebrities\" class=\"exit_trigger_set\">Kris Jenner</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$37.5 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/rihanna/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f34331358e2c990eadaa/200x200.jpg?background=000000&amp;cropX1=1172&amp;cropX2=3632&amp;cropY1=68&amp;cropY2=2528\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#84 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/rihanna/?list=celebrities\" class=\"exit_trigger_set\">Rihanna</a></td>\n" +
                    "\t\t\t\t\t<td>30</td>\n" +
                    "\t\t\t\t\t<td>$37.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/bruce-springsteen/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b438c894bbe6f1becf1b9e3/200x200.jpg?background=000000&amp;cropX1=911&amp;cropX2=2888&amp;cropY1=481&amp;cropY2=2457\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#84 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/bruce-springsteen/?list=celebrities\" class=\"exit_trigger_set\">Bruce Springsteen</a></td>\n" +
                    "\t\t\t\t\t<td>69</td>\n" +
                    "\t\t\t\t\t<td>$37.5 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kenny-chesney/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43bde64bbe6f1becf1c27e/200x200.jpg?background=000000&amp;cropX1=446&amp;cropX2=2768&amp;cropY1=335&amp;cropY2=2659\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#87 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kenny-chesney/?list=celebrities\" class=\"exit_trigger_set\">Kenny Chesney</a></td>\n" +
                    "\t\t\t\t\t<td>50</td>\n" +
                    "\t\t\t\t\t<td>$37 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/trumaine-johnson/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b1573daa7ea436b547f5657/200x200.jpg?background=000000&amp;cropX1=236&amp;cropX2=2233&amp;cropY1=4&amp;cropY2=2000\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#87 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/trumaine-johnson/?list=celebrities\" class=\"exit_trigger_set\">Trumaine Johnson</a></td>\n" +
                    "\t\t\t\t\t<td>29</td>\n" +
                    "\t\t\t\t\t<td>$37 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/imagine-dragons/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43b5d031358e2c990e93e4/200x200.jpg?background=000000&amp;cropX1=394&amp;cropX2=2644&amp;cropY1=0&amp;cropY2=2250\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#89 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/imagine-dragons/?list=celebrities\" class=\"exit_trigger_set\">Imagine Dragons</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$36.5 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/jimmy-garoppolo/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b153afa4bbe6f74868b7cb1/200x200.jpg?background=000000&amp;cropX1=807&amp;cropX2=3200&amp;cropY1=39&amp;cropY2=2430\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#90 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/jimmy-garoppolo/?list=celebrities\" class=\"exit_trigger_set\">Jimmy Garoppolo</a></td>\n" +
                    "\t\t\t\t\t<td>27</td>\n" +
                    "\t\t\t\t\t<td>$36.2 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t<tr class=\"ad\"><td class=\"ad lazy_ad\" colspan=\"6\" id=\"topx_9\"></td></tr>\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/kyrie-irving/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b154d614bbe6f74868b7f91/200x200.jpg?background=000000&amp;cropX1=459&amp;cropX2=2520&amp;cropY1=244&amp;cropY2=2307\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#91 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/kyrie-irving/?list=celebrities\" class=\"exit_trigger_set\">Kyrie Irving</a></td>\n" +
                    "\t\t\t\t\t<td>26</td>\n" +
                    "\t\t\t\t\t<td>$36.1 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/sean-hannity/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44fd19a7ea4341970e282c/200x200.jpg?background=000000&amp;cropX1=961&amp;cropX2=4101&amp;cropY1=13&amp;cropY2=3154\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#92 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/sean-hannity/?list=celebrities\" class=\"exit_trigger_set\">Sean Hannity</a></td>\n" +
                    "\t\t\t\t\t<td>57</td>\n" +
                    "\t\t\t\t\t<td>$36 M</td>\n" +
                    "\t\t\t\t\t<td>Personalities</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/giannis-antetokounmpo/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5be47a86a7ea437059167873/200x200.jpg?background=000000&amp;cropX1=101&amp;cropX2=509&amp;cropY1=0&amp;cropY2=408\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#93 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/giannis-antetokounmpo/?list=celebrities\" class=\"exit_trigger_set\">Giannis Antetokounmpo</a></td>\n" +
                    "\t\t\t\t\t<td>24</td>\n" +
                    "\t\t\t\t\t<td>$35.5 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/j-cole/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b43b7bd31358e2c990e9440/200x200.jpg?background=000000&amp;cropX1=433&amp;cropX2=2434&amp;cropY1=0&amp;cropY2=2002\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#93 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/j-cole/?list=celebrities\" class=\"exit_trigger_set\">J. Cole</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$35.5 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/blake-griffin/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5be48075a7ea437059167972/200x200.jpg?background=000000&amp;cropX1=0&amp;cropX2=1742&amp;cropY1=151&amp;cropY2=1892\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#93 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/blake-griffin/?list=celebrities\" class=\"exit_trigger_set\">Blake Griffin</a></td>\n" +
                    "\t\t\t\t\t<td>29</td>\n" +
                    "\t\t\t\t\t<td>$35.5 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/ryan-tannehill/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b156c79a7ea436b547f55af/200x200.jpg?background=000000&amp;cropX1=144&amp;cropX2=2200&amp;cropY1=139&amp;cropY2=2196\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#96 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/ryan-tannehill/?list=celebrities\" class=\"exit_trigger_set\">Ryan Tannehill</a></td>\n" +
                    "\t\t\t\t\t<td>30</td>\n" +
                    "\t\t\t\t\t<td>$35.2 M</td>\n" +
                    "\t\t\t\t\t<td>NA</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/von-miller/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b157493a7ea436b547f566f/200x200.jpg?background=000000&amp;cropX1=1000&amp;cropX2=4189&amp;cropY1=92&amp;cropY2=3280\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#97 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/von-miller/?list=celebrities\" class=\"exit_trigger_set\">Von Miller</a></td>\n" +
                    "\t\t\t\t\t<td>29</td>\n" +
                    "\t\t\t\t\t<td>$35.1 M</td>\n" +
                    "\t\t\t\t\t<td>Athletes</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/dave-chappelle/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b4391d331358e2c990e8ee0/200x200.jpg?background=000000&amp;cropX1=570&amp;cropX2=2417&amp;cropY1=137&amp;cropY2=1984\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#98 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/dave-chappelle/?list=celebrities\" class=\"exit_trigger_set\">Dave Chappelle</a></td>\n" +
                    "\t\t\t\t\t<td>45</td>\n" +
                    "\t\t\t\t\t<td>$35 M</td>\n" +
                    "\t\t\t\t\t<td>Comedians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/dr-dre/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b4393e8a7ea4341970e0871/200x200.jpg?background=000000&amp;cropX1=814&amp;cropX2=3474&amp;cropY1=95&amp;cropY2=2756\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#98 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/dr-dre/?list=celebrities\" class=\"exit_trigger_set\">Dr. Dre</a></td>\n" +
                    "\t\t\t\t\t<td>53</td>\n" +
                    "\t\t\t\t\t<td>$35 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\n" +
                    "\t\t\t<tr class=\"data\">\n" +
                    "\t\t\t\t\t<td class=\"image\"><a href=\"/profile/nas/?list=celebrities\" class=\"exit_trigger_set\"><img src=\"//specials-images.forbesimg.com/imageserve/5b44f13aa7ea4341970e26b0/200x200.jpg?background=000000&amp;cropX1=1172&amp;cropX2=3548&amp;cropY1=1322&amp;cropY2=3696\" alt=\"\"></a></td>\n" +
                    "\t\t\t\t\t<td class=\"rank\">#98 </td>\n" +
                    "\t\t\t\t\t<td class=\"name\"><a href=\"/profile/nas/?list=celebrities\" class=\"exit_trigger_set\">Nas</a></td>\n" +
                    "\t\t\t\t\t<td>-</td>\n" +
                    "\t\t\t\t\t<td>$35 M</td>\n" +
                    "\t\t\t\t\t<td>Musicians</td>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t</tbody>";
        } catch (Exception e) {
            Log.i("HTML_Error_DHtmlClass", e.getMessage());
            return "Failed!";
        }
    }
}

