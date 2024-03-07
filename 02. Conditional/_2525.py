now = input()
hour_and_time = now.split()
hour = int(hour_and_time[0])
minute = int(hour_and_time[1])
time = int(input())

def append_minute(hour, minute, time):
    minute += time
    while(minute >= 60):
        minute -= 60
        hour += 1
        if(hour == 24):
            hour = 0
    return "{} {}".format(hour, minute)

result = append_minute(hour, minute, time)
print(result)

