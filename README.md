# EpicSet-Tokens
This is the api classes used in my plugin. To get the TokensAPI implementation we will use the bukkit's serviceManager as:
TokensApi api=Bukkit.getServicesManager().load(TokensApi.class);

From there you can fetch either the tokenmanager or the shopmanager depending on your usage.

Also to create a new tokenshop you will use the ShopBuilder class.
