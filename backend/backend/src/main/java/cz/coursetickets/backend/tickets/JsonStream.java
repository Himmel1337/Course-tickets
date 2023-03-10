package cz.coursetickets.backend.tickets;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JsonStream {
    public String stream() {
        URL url;
        try {
            url = new URL("https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try (InputStream input = url.openStream()) {
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }

            return json.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getValuesForGivenKey(String jsonArrayStr, String key) {
        JSONArray jsonArray = new JSONArray(jsonArrayStr);
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString(key))
                .collect(Collectors.toList());
    }

    public List<TicketInDTO> getTickets (String json) {
        List <TicketInDTO> tickets = new ArrayList<>();
        for (int i = 0; i < getValuesForGivenKey(json, "name").size(); i++){
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            LocalDate date = LocalDate.parse(getValuesForGivenKey(json, "validFrom").get(i), inputFormatter);
            TicketInDTO ticket = new TicketInDTO((long) (i + 1),
                    getValuesForGivenKey(json, "name").get(i),
                    getValuesForGivenKey(json, "country").get(i),
                    Double.valueOf(getValuesForGivenKey(json, "move").get(i)),
                    Long.valueOf(getValuesForGivenKey(json, "amount").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "valBuy").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "valSell").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "valMid").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "currBuy").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "currSell").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "currMid").get(i)),
                    Long.valueOf(getValuesForGivenKey(json, "version").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "cnbMid").get(i)),
                    Double.valueOf(getValuesForGivenKey(json, "ecbMid").get(i)),
                    getValuesForGivenKey(json, "shortName").get(i), date);
            tickets.add(ticket);
        }

        return tickets;
    }
}
