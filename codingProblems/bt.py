import pyautogui
import time

# Number of times to click and hold Shift
click_count = 50000  
click_delay = 0.1   

# 3-second delay to let you prepare
print("You have 3 seconds to get ready...")
time.sleep(3)

for i in range(click_count):
    # Hold down the Shift key
    pyautogui.typewrite("HI Sladed")
    
    # Simulate a mouse click
    pyautogui.keyDown("enter")
    

   
    
    # Wait before the next click
    time.sleep(click_delay)

print("Task completed!")
