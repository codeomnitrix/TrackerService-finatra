# AffTracker Finatra Project

## List of Microservices
- Tracker Service
- Reporting Service
- Landing Page Service
- Routing Service

### Tracker Service

#### I. Traffic Source

##### 1) `/tracker/v1/traffic-source/create`
###### Request Payload
```
{
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<traffic_param_name, field_mapping_in_affTracker_term>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 2) `/tracker/v1/traffic-source/update/<traffic-source-id>`
###### Request Payload
```
{
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<param_name, field_value>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```

#### II. Affiliate Network

##### 1) `/tracker/v1/affiliate-network/create`
###### Reqeust Payload

```
{
	name: <affiliate-network-name>,
	tracking_params: <aff_nw_param_name, afftracker_field_name>
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 2) `/tracker/v1/affiliate-network/update/<affiliate-network-id>`
###### Reqeust Payload

```
{
	name: <affiliate-network-name>,
	tracking_params: [<aff_nw_param_name, afftracker_field_name>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```

#### III. Offers
##### 1) `/tracker/v1/offer/create`
###### Request Payload
```
{
	name: <offer-name>,
	url: <offer url without any tracking params of affiliate network>,
	selected_params: [<param_name>],
	countries: [<country_name>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 2) `/tracker/v1/offer/update/<offer-id>`
###### Request Payload
```
{
	name: <offer-name>,
	url: <offer url without any tracking params of affiliate network>,
	selected_params: [<param_name>],
	countries: [<country_name>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```




















