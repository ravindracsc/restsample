###############################################################
# This script will do the following:                          #
# - Deploy the vpkg files specified to viaduct environment 	  #
#                                                             #
# To use the script :                                         #
# 							                                  #
#                                                             #
# Created by nath ravindra 27/08/2018                         #
###############################################################



java -jar vclu.jar --deploy --jmx --username admin --password Abc123$$$ --address 127.0.0.1 --port 1617 --filename RequestAdapter.vpkg --flush
