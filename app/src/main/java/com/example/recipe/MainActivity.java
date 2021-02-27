package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Tomato Soup","1. 2 tbsp/ 30g butter , unsalted\n" +
                "2. 1 onion , finely chopped (brown, yellow, white)\n" +
                "3. 2 garlic cloves , finely chopped\n" +
                "4. 1 carrot , large, peeled and finely chopped\n" +
                "5. 1 1/2 tsp Italian herb mix OR other dried herbs (oregano, thyme, parsley, basil, or mixed)\n" +
                "6. 3/4 cup (170g) tomato paste (Note 1)\n" +
                "7. 1/2 cup (125ml) dry white wine , optional (can omit)\n" +
                "8. 4 cups (1 litre) stock/broth, chicken or veg , low sodium\n" +
                "9. 3 x 420g/15oz cans cannellini or any white beans, drained & rinsed (navy, butter, great northern, lima) (OR 2 cups dried beans, 5.5 cups cooked, Note 2)\n" +
                "10. 1/2 cup (50g) parmesan , grated\n" +
                "11. 1/2 tsp EACH salt and pepper\n" +
                "12. 120g/4oz baby spinach (or 5 - 6 cups any other leafy greens OR 4 cups diced veg, Note 3)\n" +
                "13. 3/4 cup (185ml) cream, heavy/thickened (optional) OR more butter!","Method","1. Melt butter in a pot over medium high heat. Cook garlic, onion and carrot for 5 minutes until carrot is soft and sweet.\n" +
                "2. About 3 minutes in, add the Italian herbs and cook with the onion (makes the herb flavour \"bloom\").\n" +
                "3. Turn heat up to high, add tomato paste. Cook for 2 minutes to remove the “raw” flavour.\n" +
                "4. Add white wine, cook for 3 minutes until the harsh “winey” smell is gone and mostly evaporates so you’re just left with tomato paste again.\n" +
                "5. Add 1/2 cup of beans (to thicken soup), stock, parmesan, salt and pepper. Stir, low heat, cover and simmer 3 minutes, stirring every now and then.\n" +
                "6. Use a stick blender to puree until smooth (or transfer to blender).\n" +
                "7. Add remaining beans, simmer 3 minutes. Stir in spinach until wilted, then stir in cream if using. Add more salt and pepper if needed (note: canned beans are already salted).\n" +
                "8. Serve with crusty bread for dunking!",R.drawable.soup));

        recipes1.add(new Recipes("Sandwich","1. 1 round or oval bread loaf (Note 1)\n" +
                "2. 300 g / 10 oz ham, turkey and other cooked meat slices\n" +
                "3. 1 cup roughly chopped antipasto things (olives, sun dried tomato, chargrilled peppers, artichokes, feta etc)\n" +
                "4. 4 - 6 slices cheese of choice (I used Swiss in the video)\n" +
                "5. 3 big handfuls baby spinach (~75g / 2.5oz)\n" +
                "6. GARLIC BUTTER:\n" +
                "7. 50 g / 3 tbsp salted butter , melted\n" +
                "8. 1 garlic clove , minced","Method","1. Preheat oven to 180C/350F.\n" +
                "2. Mix butter and garlic.\n" +
                "3. Cut the top off the bread loaf. Pick out bread from the loaf and the lid, leaving a wall and floor about 1.5cm / 3/5\" thick.\n" +
                "4. Place bread on a large sheet of foil on a baking tray.\n" +
                "5. Dab / brush inside with butter. Layer with: half spinach, turkey, antipasto things, remaining spinach, ham, cheese.\n" +
                "6. Tuck flappy bits inside the loaf, top with lid.\n" +
                "7. Brush with butter all over. Wrap with foil.\n" +
                "8. Weigh down with something flat and heavy - cast iron skillet is ideal.\n" +
                "9. Bake for 20 minutes. Remove skillet and foil.\n" +
                "10. Bake for a further 10 minutes until golden.\n" +
                "11. Cut into thick slices and serve immediately!",R.drawable.sandwich));

        recipes1.add(new Recipes("Salad","1. SAUCE\n" +
                "1.1  1 tbsp soy sauce , low sodium / ordinary (Note 1)\n" +
                "1.2  2 tbsp EACH hoisin sauce, rice vinegar, honey (Note 2)\n" +
                "1.3  1 tbsp sriracha , or other hot sauce (can omit)\n" +
                "1.4  2 tbsp water\n" +
                "1.5  1 garlic clove , minced\n" +
                "2. SALMON & SALAD\n" +
                "2.1  250 - 300 g / 8 - 10 oz salmon , skin off\n" +
                "2.2  2 tsp oil (vegetable, canola, peanut oil)\n" +
                "2.3  5 cups lettuce , bite size pieces (I used cos lettuce)\n" +
                "2.4  15 cherry tomatoes , halved\n" +
                "2.5  1/2 avocado , sliced\n" +
                "2.6  1 cucumber , halved, deseeded and sliced (Note 3)\n" +
                "3. ASIAN SESAME DRESSING\n" +
                "3.1  1 tbsp soy sauce (Note 1)\n" +
                "3.2  1 tsp sesame oil\n" +
                "3.3  1½ tbsp white vinegar\n" +
                "3.4  1 tbsp olive oil (Note 4)\n" +
                "3.5  1 tsp sugar (any type) or 1½ tsp honey\n" +
                "4. OPTIONAL GARNISHES\n" +
                "4.1  1/2 tsp sesame seeds\n" +
                "4.2  1/2 scallion / shallot , finely sliced","Method",
                "1. Cut salmon into 2.5cm / 1\" cubes.\n" +
                        "2. Mix Sauce in a medium bowl. Add salmon, set aside for 3 minutes.\n" +
                        "3. Mix Dressing ingredients in a jar. Shake very well (jar is best).\n" +
                        "4. Divide Salad ingredients between 2 bowls.\n" +
                        "5. Heat oil in a non stick medium skillet over medium high heat. Remove salmon from Sauce, shaking off excess. Reserve Sauce.\n" +
                        "6. Place salmon in skillet. Cook for 2 minutes, turning to caramelise as many of the sides as you can (all sides is not practical, too much turning). (Note 5)\n" +
                        "7. Pour Sauce into skillet. Cook for 30 seconds or until the Sauce reduces to a syrup (see video for how it bubbles).\n" +
                        "8. Remove from stove. Immediately transfer salmon onto Salad. Leave to rest / cool for a few minutes. Then spoon the glaze over the salmon. Sprinkle with sesame seeds and shallots/scallions, if using.\n" +
                        "9. Drizzle salad with Dressing. Serve immediately.",R.drawable.salad));
        recipes1.add(new Recipes("Pasta","1. 1 tbsp olive oil\n" +
                "2. 2 garlic cloves , minced\n" +
                "3. 1 onion , finely chopped\n" +
                "4. 2 zucchinis* , halved lengthwise and cut into sliced 0.8cm / 1/3\" slices\n" +
                "5. 1 red capsicum/bell pepper* , halved and sliced\n" +
                "6. 1 cup corn* (frozen or canned)\n" +
                "7. 1 broccoli* , broken into bite size florets\n" +
                "8. 250g/ 0.5lb ziti/penne , or other short pasta (Note 1)\n" +
                "9. 800 g / 28 oz crushed tomato\n" +
                "10. 1.5 cups / 375 ml vegetable or chicken broth\n" +
                "11. 2 tbsp tomato paste\n" +
                "12. 1 tbsp Italian herb mix (or other dried herbs)\n" +
                "13. 1 tsp garlic powder\n" +
                "14. 1/2 tsp red pepper flakes (chilli flakes, adjust spiciness to taste)\n" +
                "15. 1.5 tsp salt\n" +
                "16. 0.5 tsp black pepper","Method",
                "1. Heat oil in a large pot over medium. Add garlic and onion - cook slowly for 3 to 4 minutes until onion is translucent and sweet.\n" +
                        "2. Turn heat up to medium high, add zucchini and capsicum. Cook 1 1/2 minutes.\n" +
                        "3. Add remaining ingredients EXCEPT pasta and broccoli. Stir until tomato paste dissolves.\n" +
                        "4. When liquid starts bubbling, lower heat to medium, add pasta and stir. Top with broccoli, push in.\n" +
                        "5. Place lid on and cook for 5 minutes.\n" +
                        "6. Remove lid. Cook for another 3 to 4 minutes, stirring frequently, until pasta is almost cooked through and most of the liquid has been absorbed by the pasta.\n" +
                        "7. Stir through half the cheese (if using). Adjust salt and pepper to taste.\n" +
                        "8. Top with remaining cheese, put lid on. Leave for 1 minute until cheese is melted and pasta is perfectly cooked.\n" +
                        "9. Garnish with parsley and serve immediately. Don't leave leftovers in the pot, residual heat will overcook the pasta so transfer into a serving dish.",R.drawable.pasta));

        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);

    }
}