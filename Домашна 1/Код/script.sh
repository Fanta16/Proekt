#/bin/bash
get-overpass 'relation/6966474'  > centar.txt
coordinates=` sed 's/coordinates/\ncoordinates/' centar.txt | grep 'coordinates' | sed  's/],/],\n/g' | sed '/coordinates":/d'| awk -F[ ' { print $1,$2}'|awk -F]  '{ print $1}'`
i=0
#for i in $coordinates
#do

	#lon=`echo $i| awk -F, '{ print $1 ;}'`
	#lat=`echo $i| awk -F, '{ print $2 ;}'`

	#url=`echo 'https://geoapify-platform.p.rapidapi.com/v1/geocode/reverse?lat=%20'${lat}'&apiKey=1fd35f6dd643417b884a46c4311deec4&lon='${lon}'&lang=en&limit=1'`
	#x=`echo ${lat}'%2C'${lon}`
	#url=`echo 'https://trueway-geocoding.p.rapidapi.com/ReverseGeocode?location='${x}'&language=en'`
	#wget  --quiet \
	#--method GET \
        #--header 'x-rapidapi-key: c9013b11a3mshea34cef0f9d2b30p11c61ejsnc700aad9b302' \
	#--header 'x-rapidapi-host: trueway-geocoding.p.rapidapi.com' \
	#--output-document=./lokacii/${i}.json \
	#- $url

#done
	i=0
	cd ./lokacii
	echo "CREATE TABLE Location ( Latitude  INT, Longitude  INT, Address VARCHAR(100), Street VARCHAR(100), PRIMARY KEY (Latitude,Longitude));" >> main.sql 
	for i in $coordinates
	do
		address=`cat ${i}.json | sed 's/"//g'  | grep "address:" | sed 's/Macedonia,/Macedonia,\n/g' | awk  -F: '{ print $2 }'`
		street=`cat ${i}.json | sed 's/"//g' | grep "street:" | sed 's/,/\n/g' | awk -F: '{ print $2 }'`
		lon=`cat ${i}.json | sed 's/"//g' | grep "lng:" | sed 's/,/\n/g' | awk -F: '{ print $2 }'`
		lat=`cat ${i}.json | sed 's/"//g' | grep "lat:" | sed 's/,/\n/g' | awk -F: '{ print $2 }'`
		j=0
		OIFS=${IFS}
		IFS=$'\n'
		broj=0
		for j in $lon
		do
			lo=${j}
			k=${j}
			for k in $lat
			do
la=${k}
           
			 break
			done

			for k in $address
			do
addr=${k}
break

			done

			for k in $street
			do
				str=${k}
				break

			done
			echo "INSERT INTO Location (Latitude,Longitude,Address,Street) VALUES (${la},${lo},'${addr}','${str}');" >> main.sql
		done

IFS=${OIFS}


	
	done


	cat main.sql


