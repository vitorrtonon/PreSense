wm.types = {
	"types": {
		"boolean": {
			"primitiveType": "Boolean",
			"internal": true
		},
		"byte": {
			"primitiveType": "Number",
			"internal": true
		},
		"char": {
			"primitiveType": "String",
			"internal": true
		},
		"com.presense.dadjf5a027tja9.Attendance": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"attendanceId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "long",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"event": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Event",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"lasttime": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"person": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Person",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"totaltime": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Beacon": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"beaconId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "string",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"person": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Person",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Event": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"attendances": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Attendance",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"enddate": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"eventId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "long",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"eventmanagers": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Eventmanager",
					"required": false,
					"fieldOrder": 5,
					"noChange": [],
					"include": []
				},
				"name": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"personevents": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Personevent",
					"required": false,
					"fieldOrder": 6,
					"noChange": [],
					"include": []
				},
				"sensors": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Sensor",
					"required": false,
					"fieldOrder": 7,
					"noChange": [],
					"include": []
				},
				"startdate": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.util.Date",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Eventmanager": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"event": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Event",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.EventmanagerId",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"manager": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Manager",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.EventmanagerId": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"eventId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Long",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"managerId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Manager": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"eventmanagers": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Eventmanager",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				},
				"name": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"password": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"role": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": true,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"username": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "string",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Person": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"attendances": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Attendance",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"beacons": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Beacon",
					"required": false,
					"fieldOrder": 3,
					"noChange": [],
					"include": []
				},
				"name": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"personId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "long",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"personevents": {
					"isList": true,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Personevent",
					"required": false,
					"fieldOrder": 4,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Personevent": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"event": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Event",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"id": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.PersoneventId",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"person": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Person",
					"required": true,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.PersoneventId": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"eventId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Long",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				},
				"personId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.Long",
					"required": true,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				}
			}
		},
		"com.presense.dadjf5a027tja9.Sensor": {
			"service": "dadjf5a027tja9",
			"liveService": false,
			"internal": false,
			"fields": {
				"event": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "com.presense.dadjf5a027tja9.Event",
					"required": false,
					"fieldOrder": 1,
					"noChange": [],
					"include": []
				},
				"name": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "java.lang.String",
					"required": false,
					"fieldOrder": 2,
					"noChange": [],
					"include": []
				},
				"sensorId": {
					"isList": false,
					"fieldSubType": null,
					"exclude": [],
					"type": "long",
					"required": true,
					"fieldOrder": 0,
					"noChange": [],
					"include": []
				}
			}
		},
		"double": {
			"primitiveType": "Number",
			"internal": true
		},
		"float": {
			"primitiveType": "Number",
			"internal": true
		},
		"int": {
			"primitiveType": "Number",
			"internal": true
		},
		"java.lang.Boolean": {
			"primitiveType": "Boolean",
			"internal": false
		},
		"java.lang.Byte": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Character": {
			"primitiveType": "String",
			"internal": false
		},
		"java.lang.Double": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Float": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Integer": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Long": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.Short": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.lang.String": {
			"primitiveType": "String",
			"internal": false
		},
		"java.lang.StringBuffer": {
			"primitiveType": "String",
			"internal": false
		},
		"java.math.BigDecimal": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.math.BigInteger": {
			"primitiveType": "Number",
			"internal": false
		},
		"java.sql.Date": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.sql.Time": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.sql.Timestamp": {
			"primitiveType": "Date",
			"internal": false
		},
		"java.util.Date": {
			"primitiveType": "Date",
			"internal": false
		},
		"long": {
			"primitiveType": "Number",
			"internal": true
		},
		"org.joda.time.LocalDateTime": {
			"primitiveType": "DateTime",
			"internal": true
		},
		"short": {
			"primitiveType": "Number",
			"internal": true
		}
	}
};