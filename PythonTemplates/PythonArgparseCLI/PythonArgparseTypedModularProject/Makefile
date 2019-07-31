deb-package:
	python3 setup.py --command-packages=stdeb.command bdist_deb
snap-package:
	snapcraft
standalone:
	echo "from  %{APPNAMELC}.run import main; main()" > main.py
	PYTHONOPTIMIZE=1 pyinstaller main.py -F -n %{APPNAMELC} --distpath dist/
	rm main.py
py-install:
	python3 setup.py install --user
clean:
	rm -rf build dist deb_dist %{APPNAME}.egg-info
	rm -rf %{APPNAME}*.snap %{APPNAME}-*.tar.gz main.spec