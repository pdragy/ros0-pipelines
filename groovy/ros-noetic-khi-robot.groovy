node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_robot.git', branch: 'master'
    registerROS('ros:noetic-ros-base', [
        'libopenblas-dev',
        'ros-noetic-controller-manager',
        'ros-noetic-diagnostic-updater',
        'ros-noetic-joint-limits-interface',
        'ros-noetic-moveit-core',
        'ros-noetic-realtime-tools',
        'ros-noetic-tf-conversions',
        'ros-noetic-transmission-interface'
    ], [])
}
