# AffTracker Finatra Project

## List of Microservices
- Tracker Service
- Reporting Service
- Landing Page Service
- Routing Service

### Tracker Service
Following set of APIs would be there to set up a tracker for particular offer and traffic source

#### I. `/tracker/v1/traffic-source/create`
##### Request Payload
```
{
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<param_name, field_value>]
}
```
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
#### II. `/tracker/v1/traffic-source/update/<traffic-source-id>`
##### Request Payload
```
{
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<param_name, field_value>]
}
```
```
{
	status: <status-code>,
	status_message: <status-message>
}
```


