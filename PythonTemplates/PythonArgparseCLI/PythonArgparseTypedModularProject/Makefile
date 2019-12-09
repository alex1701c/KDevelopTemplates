deb-package:
	python3 setup.py --command-packages=stdeb.command bdist_deb
snap-package:
	snapcraft
standalone:
	echo "from  %{APPNAMELC}.main import main; main()" > main.py
	PYTHONOPTIMIZE=1 pyinstaller main.py -F -n %{APPNAMELC} --distpath dist/
	rm main.py
py-install:
	python3 setup.py install --user
py-bundle:
	# Bundles all the project files into a compressed, executable file. No interpreter or libraies included
	rm -rf tmp
	mkdir -p tmp
	# Copy files recrusively and reserve attributes
	for d in %{APPNAMELC} %{APPNAMELC}/utilities ; do \
	  mkdir -p tmp/$$d ;\
	  cp -pPR $$d/*.py tmp/$$d/ ;\
	done
	# Create entry point and package archive
	echo "from  %{APPNAMELC}.main import main; main()" > tmp/__main__.py
	cd tmp ; zip -q _%{APPNAMELC} %{APPNAMELC}/*.py %{APPNAMELC}/*/*.py __main__.py
	# Add shebang line and append zip file content
	echo '#!/usr/bin/python3' > %{APPNAMELC}_bundled
	cat tmp/_%{APPNAMELC}.zip >> %{APPNAMELC}_bundled
	chmod a+x %{APPNAMELC}_bundled
	rm -rf tmp
clean:
	rm -rf build dist deb_dist %{APPNAME}.egg-info
	rm -rf %{APPNAME}*.snap %{APPNAME}-*.tar.gz main.spec