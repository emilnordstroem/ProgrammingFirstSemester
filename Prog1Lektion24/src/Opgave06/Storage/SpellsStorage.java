package Opgave06.Storage;

import Opgave06.Models.Spell;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class SpellsStorage {
    private ArrayList<Spell> spells;

    public SpellsStorage() {
        Gson gson = new GsonBuilder().create();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://hp-api.onrender.com/api/spells"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            spells = gson.fromJson(response.body(), new TypeToken<List<Spell>>(){}.getType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public Spell findSpell(String name){
        Spell spell = null;
        int left = 0;
        int right = spells.size() - 1;
        while (spell == null && left <= right){
            int middle = (left + right) / 2;
            Spell candidateElement = spells.get(middle);
            if(candidateElement.getName().equals(name)){
                spell = candidateElement;
            } else if (candidateElement.getName().compareTo(name) > 0){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return spell;
    }
}

