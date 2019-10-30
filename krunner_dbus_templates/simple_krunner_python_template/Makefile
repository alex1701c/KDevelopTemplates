install-config:
	mkdir -p ~/.local/share/kservices5/
	cp %{APPNAMELC}.desktop ~/.local/share/kservices5/
	kquitapp5 krunner; kstart5 krunner

create-autostart:
	# Configure the path in the .desktop file first
	mkdir -p ~/.config/autostart/
	cp %{APPNAMELC}_autostart.desktop ~/.config/autostart/
