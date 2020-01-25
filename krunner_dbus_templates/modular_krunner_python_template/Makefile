install-dev:
	mkdir -p ~/.local/share/kservices5/
	cp %{APPNAMELC}/resources/plasma-runner-%{APPNAMELC}.desktop ~/.local/share/kservices5/
	kquitapp5 krunner; kstart5 krunner
install:
	python3 setup.py install --user
	make install-dev
	mkdir -p ~/.config/autostart/
	cp %{APPNAMELC}/resources/%{APPNAMELC}_autostart.desktop ~/.config/autostart/
